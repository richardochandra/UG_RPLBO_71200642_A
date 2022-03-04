package com.ug4.soal1;

import java.time.LocalDate;

public class Pohon {
    private int daun;
    private int akar;
    private int dahan;
    final private int MasaHidup = 10;
    private int umur;
    private Buah buah;
    private LocalDate tanggalMusim;
    private Musim Musim;

    public int getDaun() {
        return daun;
    }
    public void setDaun(int daun) {
        this.daun = daun;
    }
    public int getAkar() {
        return akar;
    }
    private void setAkar(final int akar) {
        this.akar = akar;
    }
    public int getDahan() {
        return this.dahan;
    }
    private void setDahan(final int dahan) {
        this.dahan = dahan;
    }
    public static int getMasahidup() {
        return 10;
    }
    public int getUmur() {
        return this.umur;
    }
    private void setUmur(final int umur) {
        this.umur = umur;
    }
    public Buah getBuah() {
        return this.buah;
    }
    private void setBuah(final Buah buah) {
        this.buah = buah;
    }
    public Musim getMusim() {
        return this.Musim;
    }
    public Pohon(final int daun, final int akar, final int dahan, final int umur) {
        this.setDaun(daun);
        this.setAkar(akar);
        this.setDahan(dahan);
        this.setUmur(umur);
    }
    public void setMusim(final Musim musim) {
        this.Musim = musim;
        if (this.Musim.getNama().equalsIgnoreCase("kemarau")) {
            final String nama = "Apel";
            final int masaPanen = 1;
            final int lamaBertahan = 7;
            final int rentangBerbuah = 5;
            final int jumlahBuah = musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        }
        else if (this.Musim.getNama().equalsIgnoreCase("penghujan")) {
            final String nama = "Pisang";
            final int masaPanen = 10;
            final int lamaBertahan = 5;
            final int rentangBerbuah = 10;
            final int jumlahBuah = musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        }
        else if (this.Musim.getNama().equalsIgnoreCase("dingin")) {
            final String nama = "Jeruk";
            final int masaPanen = 20;
            final int lamaBertahan = 13;
            final int rentangBerbuah = 20;
            final int jumlahBuah = this.Musim.getHari() / masaPanen * rentangBerbuah;
            this.setBuah(new Buah(nama, jumlahBuah, masaPanen, lamaBertahan));
            this.setTanggalMusim(LocalDate.now());
        }
        else {
            System.out.println("Musim yang kamu masukan tidak benar");
        }
    }

    public LocalDate getTanggalMusim() {
        return this.tanggalMusim;
    }

    public void setTanggalMusim(final LocalDate tanggalMusim) {
        this.tanggalMusim = tanggalMusim;
    }
}
