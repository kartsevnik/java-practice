package oop;

public class Enemy implements Mortal{
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " dead");
        } else {this.health -= Math.min(damage, health);
        }
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(this.damage);
        System.out.println(getName() + " attack hero. Hero has health left: " + hero.getHealth());
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
