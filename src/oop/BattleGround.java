package oop;

public class BattleGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Aragorn", 100, 20);
        Enemy ork = new Enemy("Ork", 100, 10);
        attackEnemy(ork, warrior);

    }

    public static void attackEnemy(Enemy enemy, Hero hero) {

        while (enemy.isAlive() && hero.isAlive()) {

            if (enemy.getHealth() != 0) {
            hero.attackEnemy(enemy);
            enemy.attackHero(hero);
            }
        }

    }
}

