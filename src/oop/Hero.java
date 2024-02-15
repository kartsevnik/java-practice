package oop;

public abstract class Hero implements Mortal{

private String name;
    private int health;
private int damage;

    public int getHealth() {
        return health;
    }

    public Hero (String name, int health, int damage) {
    this.name = name;
    this.health = health;
    this.damage = damage;

}

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " dead");
        } else {this.health -= Math.min(damage, health);}


    }

    public String getName() {
    return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public abstract boolean isAlive();
}
