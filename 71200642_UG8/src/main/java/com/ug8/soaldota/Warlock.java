package com.ug8.soaldota;

public class Warlock extends Hero implements Summoner {
    private int numOfSummon;

    public Warlock() {
        super("Warlock",80,700);
    }

    public void attack(Creep creep) {
        creep.attacked(Damage);
    }
    @Override
    public Golem summon() {
        this.numOfSummon+=1;
        Golem g1 = new Golem(this);
        return g1;
    }
}

