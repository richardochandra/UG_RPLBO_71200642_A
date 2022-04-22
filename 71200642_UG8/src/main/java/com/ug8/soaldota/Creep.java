package com.ug8.soaldota;

public class Creep extends Character implements AttackingHero{
    public Creep(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Hero hero) {
        hero.attacked(Damage);
    }
}
