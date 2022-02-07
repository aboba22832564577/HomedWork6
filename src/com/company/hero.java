package com.company;

public abstract class hero extends gameEntity implements IAbility{

    public hero(int health, int damage) {
        super(health, damage);
    }
}

