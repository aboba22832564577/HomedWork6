package com.company;

public class boss extends gameEntity{
    public boss(int health, int damage) {
        super(health, damage);
    }
    weapon weapon = new weapon(100,  "Arch");

    public com.company.weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(com.company.weapon weapon) {
        this.weapon = weapon;
    }
}
