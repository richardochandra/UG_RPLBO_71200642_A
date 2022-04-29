package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{
    public Melee(String name, int damage, int health) {
        super(name, damage, health);
    }
    public void ultimate(){
        System.out.println(getName()+" mengaktifkan ulti. Damage saat ini bertambah 100");
        addDamage(100);
    }

    public void attack(Character enemy){
        if (enemy instanceof Creep){

            setHealthBonus(200);
        }
        else {super.attack(enemy);
        }
    }
}
