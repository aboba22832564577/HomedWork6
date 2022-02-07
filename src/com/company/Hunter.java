package com.company;

import java.util.Random;

public class Hunter extends hero{
    public Hunter(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(hero[] heroes, boss boss) {
        int isAvailable = new Random().nextInt(2);
        if(isAvailable == 1){
            int randomDamage = new Random().nextInt(101);
            this.damage = this.damage + randomDamage;
            System.out.println("Hunter boosted his damage on: " + randomDamage);
        }
    }
}
