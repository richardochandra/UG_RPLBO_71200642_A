package com.ug8.soaldota;

public class LoneDruid extends Hero implements Upgradeable, Summoner{
    public LoneDruid() {
        super("Lone Druid", 140, 1800);
    }

    private int killCreep;
    private int level;


    public void attack(Creep creep) {
        creep.attacked(Damage);
    }
    public void upgrade(){}

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Kill Creep : "+ killCreep);
    }


    @Override
    public SpiritBear summon() {
        SpiritBear s1 = new SpiritBear(this);
        return s1;
    }
}
