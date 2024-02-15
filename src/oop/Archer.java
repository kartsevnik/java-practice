package oop;

public class Archer extends Hero implements Mortal{
    private int damage;
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy() {
        System.out.println(getName() + " hero shoots a bow at the enemy");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(super.getDamage());
        System.out.println(getName() + " hero shoots a bow at the enemy. Enemy has health left: " + enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
