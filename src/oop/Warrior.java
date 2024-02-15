package oop;

public class Warrior extends Hero implements Mortal{

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy() {
        System.out.println(getName() + " strikes the enemy");
    }
@Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(super.getDamage());
        System.out.println(getName() + " strikes the enemy. Enemy has health left: " + enemy.getHealth());
    }
    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
