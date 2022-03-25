package org.ug7.game;

public class Ninja extends Karakter{
    public Ninja(Player player) {
        super(player);
    }
    private boolean isAbilityReady;

    @Override
    public void buyWeapon(int weapon) {
        System.out.println("Daftar senjata : \n1. Pisau \n2. Tongkat \n3. Tongkat Sihir \n4. Katana");
        System.out.println("Pilih senjata : "+ weapon);
        if (weapon == 1 || weapon==4){
            super.buyWeapon(weapon);
        }
        else {
            System.out.println("Ninja hanya boleh membeli 1. Pisau / 4. Katana");
        }
    }
    @Override
    public void abilityAttack(Karakter karakter){
        if (this.isAbilityReady){
            int damage = karakter.getHP() /2;
            if (!this.isWalk()){
                damage = karakter.getHP();
            }
            System.out.println("Rasakan ini badut " + karakter.getPlayer().getUsername() + "!");
            karakter.damageGet(damage);
            if (karakter.getHP()==0){
                this.getPlayer().levelUp();
            }
        }
        else {
            System.out.println("Skill ability belum aktif!");
        }
    }

    @Override
    public void normalAttack(Karakter karakter) {
        if (this.getWeapon() == 0){
            System.out.println("Maaf, " + this.getPlayer().getUsername() + " Silahkan beli senjata dulu!");
        }
        if (this.isWalk()){
            int damage =0;
            if (this.getWeapon() == 1){
                damage = 20;
            }
            else if (this.getWeapon() == 2){
                damage = 60;
            }
            else if (this.getWeapon() == 3){
                damage = 25;
            }
            else if (this.getWeapon() == 4){
                damage = 50;
            }
            else {
                damage = 0;
            }
            damage *= (int)1.5;
            karakter.damageGet(damage);
            if (karakter.getHP() <50){
                this.isAbilityReady = true;
            }
            if (karakter.getHP()==0){
                this.getPlayer().levelUp();
            }
        }
        else {
            super.normalAttack(karakter);
        }
    }

    @Override
    public void walk(boolean kegiatan) {
        if (!kegiatan){
            System.out.println(this.getPlayer().getUsername()+ " menghilang! (lari)");
        }
        super.walk(kegiatan);
    }

    @Override
    public void getInfo() {
        System.out.println("[Karakter Ninja]");
        super.getInfo();
    }
}
