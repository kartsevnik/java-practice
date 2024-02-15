package oop;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Aragorn",100, 20);
        Hero mage = new Mage("Gendalf", 100,25);
        Hero archer = new Archer("Legalas",100, 15);
        Enemy ork = new Enemy("Ork", 100, 10);
        attackEnemy(ork, warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {

        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
