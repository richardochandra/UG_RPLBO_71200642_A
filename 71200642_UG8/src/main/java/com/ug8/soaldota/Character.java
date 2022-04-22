package com.ug8.soaldota;

public  abstract class Character {
    protected int Damage;
    protected String Name;
    protected int Health;

    public Character(String name,int damage, int health){
        Name = name;
        Damage = damage;
        Health = health;
    }

    public void attacked(int serangan){
        Health -= serangan;

    }
    public void showCharacterInfo(){
        System.out.println("Name : "+Name);
        System.out.println("Health : "+Health);
        System.out.println("Damage : "+Damage);
    }
    public boolean isDie(){
        if (Health <= 0){
            Health =0;
            return true;
        }
        else {return false;}
    }
}
