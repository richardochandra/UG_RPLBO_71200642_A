package com.ug8.soaldota;

public abstract class SummonCharacter extends Hero{
    protected Summoner owner;
    public SummonCharacter(String name, int damage, int health,Summoner summoner) {
        super(name,damage, health);
        this.owner=summoner;
    }
}
