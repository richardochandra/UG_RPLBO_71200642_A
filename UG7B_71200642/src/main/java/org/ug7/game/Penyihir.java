package org.ug7.game;

public class Penyihir extends Karakter{
    private boolean isAbilityReady;

    public Penyihir(Player player) {
        super(player);
    }

    @Override
    public void buyWeapon(int weapon) {
        System.out.println("Daftar senjata:\n 1. Pisau\n 2. Tongkat\n 3. Tongkat Sihir\n 4. Katana");
        System.out.println("Pilih senjata: " + weapon);
        if (weapon == 2 || weapon == 3) {
            super.buyWeapon(weapon);
        }
        System.out.println("Penyihir hanya boleh membeli 2. Tongkat / 3. Tongkat Sihir");
    }

    @Override
    public void abilityAttack(Karakter karakter) {
        if (this.isAbilityReady){
            int heal;
            if (this.isWalk()){
                heal = karakter.getHP()/2;
            }
            else {
                heal = 100;
            }
            System.out.println("Tidak semudah itu badut " + karakter.getPlayer().getUsername() + "!");
            super.HPGet(heal);
        }
        else {
            System.out.println("Ability anda belum aktif!");
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
            System.out.println(this.getPlayer().getUsername()+ "Terbang! (lari)");
        }
        super.walk(kegiatan);
    }

    @Override
    public void getInfo() {
        System.out.println("[Karakter penyihir]");
        super.getInfo();
    }
}
