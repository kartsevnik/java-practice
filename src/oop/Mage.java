package oop;

public class Mage extends Hero implements Mortal{

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy() {
        System.out.println(getName() + " casts a spell on the enemy");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(super.getDamage());
        System.out.println(getName() + " casts a spell on the enemy. Enemy has health left: " + enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
