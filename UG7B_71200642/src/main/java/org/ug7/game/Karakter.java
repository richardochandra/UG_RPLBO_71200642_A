package org.ug7.game;

public class Karakter {
    private Player player;
    private int HP;
    private int money;
    private int weapon;
    private boolean isWalk;

    public Karakter (Player player){
        this.HP = 100;
        this.money = 5000;
        this.weapon = 0;
        this.isWalk = false;
        this.player = new Player(player.getUsername(), player.getPassword());
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getHP() {
        return this.HP;
    }
    public int getMoney() {
        return money;
    }

    public int getWeapon() {
        return this.weapon;
    }

    public void walk(boolean kegiatan) {
        this.isWalk=kegiatan;
    }

    public boolean isWalk() {
        return this.isWalk;
    }

    public void buyWeapon(int weapon){
        int price = 0;
    if (weapon > 0 || weapon <5){
        if (weapon == 1){
            price = 500;
        }
        else if (weapon ==2){
            price =3000;
        }
        else if (weapon==3){
            price=2000;
        }
        else if (weapon==4) {
            price = 4000;
        }

    }
    else {
        System.out.println("Pilihan ang kamu masukan salah!");
    }
    if (this.money <= price){
        System.out.println("Uang tidak cukup");
    }
    else {
        this.money-=price;
        System.out.println("Pembelian sukses!\nSisa uang: "+this.getMoney());
    }
    }
    public void abilityAttack(Karakter karakter){
        karakter.HP -=0;
        karakter.damageGet(0);
    }
    public void damageGet(int damage){
        this.HP -= damage;
        System.out.println(this.getPlayer().getUsername()+"terkena damage!!\nSisah HP: "+this.getHP());
        if (this.getHP()<=0);
        System.out.println(this.getPlayer().getUsername()+ "MATI!!");
    }
    public void HPGet(int hp){
        this.HP += hp;
        if (this.getHP() >= 100){
            this.HP = 100;
            System.out.println("HP anda sudah penuh!");
        }
        else {
            System.out.println("HP anda sekarang: "+this.getHP());
        }
    }
    public void getInfo(){
        System.out.println("Username: " + this.getPlayer().getUsername());
        System.out.println("Level: " + this.getPlayer().getLevel());
        System.out.println("Money: " + this.getMoney());
        String isDie = "";
        if (this.getHP() <=0){
            isDie = "[MATI]";
        }
        System.out.println("HP: " + getHP() + " " +isDie);
        String weapon = null;
        if (this.weapon == 1){
            weapon = "Pisau";
        }
        else if (this.weapon == 2){
            weapon = "Tongkat Sihir";
        }
        else if (this.weapon == 3){
            weapon = "Tongkat";
        }
        else if (this.weapon == 4){
            weapon = "Katana";
        }
        else {
            weapon = "Tidak memiliki senjata (TANGAN KOSONG)";
        }
        System.out.println("Weapon: " + weapon);
        String movement;
        if (this.isWalk){
            movement = "Berjalan";
        }
        else {
            movement= "Berlari";
        }
        System.out.println("Movement: " + movement);
        System.out.println();
    }
    public void normalAttack (Karakter karakter){
        int damage = 0;
        if (this.weapon == 1){
            damage = 20;
        }
        else if (this.weapon == 2){
            damage = 60;
        }
        else if (this.weapon == 3){
            damage = 25;
        }
        else if (this.weapon == 4){
            damage = 50;
        }
        else {
            damage = 0;
        }
    }
}
