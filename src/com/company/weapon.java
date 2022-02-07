package com.company;

public class weapon {
    protected int damage;
    protected String weaponType;

    public weapon(int damage, String weaponType) {
        this.damage = damage;
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "--Damage: " + damage +
                " Weapon Type: " + weaponType;
    }
}