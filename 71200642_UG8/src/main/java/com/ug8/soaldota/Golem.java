package com.ug8.soaldota;

public class Golem extends SummonCharacter implements Summoner {


    public Golem(Summoner summoner) {
        super("Golem", 120, 1000, summoner);
    }

    @Override
    public void attack(Creep creep) {
        creep.attacked(Damage);
        if (creep.isDie()){
            kill+=1;
        }
    }

    protected int kill;

    @Override
    public Golem summon() {
        if (kill > 0) {
            kill -= 1;
            Golem g2 = new Golem(this);
            return g2;
        }
        else {return null;}
    }
}



