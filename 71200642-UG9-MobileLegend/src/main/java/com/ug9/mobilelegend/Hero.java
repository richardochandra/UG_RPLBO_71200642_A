package com.ug9.mobilelegend;

public class Hero extends Character{
    @Override
    public void attack(Character enemy){

        if (enemy.getHealth() <=0){
            enemy.setDie(true);
            enemy.setHealth(0);
        }
        if (enemy.isDie()){
            level+=1;
        }
        if (enemy instanceof Melee || enemy instanceof Ranged) {
            if (enemy.isDie()) {
                lifeSteal += 150;
            }
        }
        setHealth(getHealth()+lifeSteal);
        if (getHealth() >= healthMax){
            setHealth(healthMax);
        }
        enemy.setHealth(enemy.getHealth()-getDamage());
        attackInformation(enemy,getDamage());
    }

    private int healthBonus;
    private int level;
    private int healthMax;
    private int lifeSteal = 50;

    public Hero(String name, int damage, int health){
        super(name, damage, health);
        this.healthMax = health;
    }

    public void addDamage(int adddamage){
        setDamage(getDamage() + adddamage);
    }
    public void setHealthBonus(int healthBonus){
        this.healthBonus = healthBonus;
    }
    public int getLevel(){
        return level;
    }
}
