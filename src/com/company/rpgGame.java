package com.company;

public class rpgGame {
    private static void printStatistics(hero heroes[], boss boss){
        System.out.println("__________________");
        System.out.println("Boss health: " + boss.getHealth());
        for (hero hero: heroes)  {
            System.out.println(hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        System.out.println("__________________");
    }
    private static void heroesHits(hero heroes[], boss boss){
        for (hero hero : heroes){
            int heroDamage = hero.getDamage();
            boss.damage(heroDamage);
            System.out.println(hero.getClass().getSimpleName()
                    + " attack Boss -" + heroDamage);
        }
    }
    private static void bossHits(hero heroes[], boss boss){
        for (hero hero : heroes){
            int bossDamage = boss.getDamage()+ boss.getWeapon().damage;
            hero.damage(bossDamage);
            System.out.println("Boss attack: " + hero.getClass().getSimpleName()
                    + " - " + bossDamage + boss.getWeapon());
        }
    }
    private static boolean isFinish(hero heroes [], boss boss){
        if (boss.getHealth() <= 0 ){
            System.out.println("heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for(hero hero : heroes ){
            if(hero.getHealth() >0){
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead){
            System.out.println("Ranel won!!!");
        }
        return allHeroesDead;
    }

    private static void round(hero heroes[], boss boss){
        bossHits(heroes, boss);

        heroesHits(heroes, boss);

        applyAbility(heroes, boss);

        printStatistics(heroes, boss);
    }

    private static hero[] createHeroes(){
        Hunter hunter = new Hunter(1200, 250);
        magical magical = new magical(1000,300);
        warrior warrior = new warrior(1200, 350);
        medic medic = new medic(1500, 0);
        hero[] heroes = {hunter, magical, warrior, medic};
        return heroes;
    }
    private static void applyAbility(hero heroes[], boss boss){
        for (hero hero : heroes){
            hero.useAbility(heroes, boss);
        }
    }

    public static void startGame(){
        hero[] heroes = createHeroes();
        boss boss = new boss(4500, 400);
        printStatistics(heroes, boss);
        while (!isFinish(heroes, boss)){
            round(heroes, boss);
        }
    }
}
