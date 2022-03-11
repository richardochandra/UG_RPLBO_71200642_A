package com.ug5b.soal2;

public class Buku {
    private String kode;
    private static int nextNum;
    private String judul;
    private String penulis;
    private long harga;
    private int stock;

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public long getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public Buku(String argJudul, String argPenulis, long argHarga, int argStock) {
        this.judul = argJudul;
        this.penulis = argPenulis;
        this.harga = argHarga;
        this.stock = argStock;

        nextNum +=1;
        kode = "NV24510"+nextNum;

    }
}
