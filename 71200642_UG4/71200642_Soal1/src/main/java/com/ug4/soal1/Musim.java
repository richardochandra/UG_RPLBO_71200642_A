package com.ug4.soal1;

public class Musim {
    private String nama;
    private int hari;

    public String getNama() {
        return this.nama;
    }

    public void setNama(final String nama) {
        this.nama = nama;
    }

    public int getHari() {
        return this.hari;
    }

    public void setHari(final int hari) {
        this.hari = hari;
    }
    public Musim(final String nama, final int hari) {
        this.setNama(nama);
        this.setHari(hari);
    }

}
