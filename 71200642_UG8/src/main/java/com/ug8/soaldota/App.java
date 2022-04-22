package com.ug8.soaldota;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Creep creep1 = new Creep("Creep1",20,200);
        Creep creep2 = new Creep("Creep2",20,200);
        Creep creep3 = new Creep("Creep3",20,200);

        LoneDruid LD1 = new LoneDruid();
        Warlock WL1 = new Warlock();
        SpiritBear SB1 = LD1.summon();
        Golem g1 = WL1.summon();

        creep1.attack(SB1);
        creep1.attack(WL1);

        LD1.attack(creep1);
        SB1.attack(creep2);
        WL1.attack(creep3);

        g1.attack(creep1);
        g1.attack(creep2);

        Golem minigolem = g1.summon();

        LD1.showCharacterInfo();
        System.out.println("\n");
        SB1.showCharacterInfo();
        System.out.println("\n");
        minigolem.showCharacterInfo();

    }
}

