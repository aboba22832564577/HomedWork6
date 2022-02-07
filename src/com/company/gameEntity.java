package com.company;

public class gameEntity {
    protected int health, damage;

    public gameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void damage(int damage){
        if (this.health - damage <= 0){
            this.health = 0;
        } else {
            this.health = this.health - damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
