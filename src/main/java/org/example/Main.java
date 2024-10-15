package org.example;
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(60);
        boss.setDefence("Magical");
        System.out.println("Boss health " + boss.getHealth() + " Boss damage " + boss.getDamage() + " Boss defence " + boss.getDefence());
        createHeroes();
    }
    public static Hero[] createHeroes (){
        Hero firstHero = new Hero(230, 20);
        Hero secondHero = new Hero(220, 15, "Critical damage");
        Hero thirdHero = new Hero(300, 25, "Invisibility");

        Hero[] heroes = {firstHero, secondHero, thirdHero};

        for (Hero hero : heroes) {
            System.out.println("heroes health " + hero.getHealth() + " heroes damage " + hero.getDamage() + " heroes ability " + hero.getAbility());
        }
        return heroes;
    }
}