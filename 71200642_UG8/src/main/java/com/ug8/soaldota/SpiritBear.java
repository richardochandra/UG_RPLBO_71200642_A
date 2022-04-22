package com.ug8.soaldota;

public class SpiritBear extends SummonCharacter{
    public LoneDruid loneDruid;
    public Creep creep;

    public SpiritBear(Summoner summoner) {
        super("Spirit Bear", 130, 1000,summoner);
    }

    public void attack(Creep creep) {
        creep.attacked(Damage);
    }
}
