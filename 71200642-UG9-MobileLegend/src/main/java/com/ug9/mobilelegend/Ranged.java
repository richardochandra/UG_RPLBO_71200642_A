package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill{

    public Ranged(String name, int damage, int health) {
        super(name, damage, health);
    }
    public void attack(Character enemy) {
        if (enemy instanceof Minion){
            setHealthBonus(150);
        }
        else {super.attack(enemy);}
    }

    public void ultimate(){
        System.out.println(getName()+" mengaktifkan ulti. Damage saat ini bertambah 150");
        addDamage(150);
    }
}
