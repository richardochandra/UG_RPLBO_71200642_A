package com.ug4.soal1;

public class Buah {
    private String nama;
    private int jumlah;
    private int masaPanen;
    private int lamaBertahan;
    public String getNama() {
        return this.nama;
    }
    private void setNama(final String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return this.jumlah;
    }
    private void setJumlah(final int jumlah) {
        this.jumlah = jumlah;
    }
    public int getMasaPanen() {
        return this.masaPanen;
    }
    private void setMasaPanen(final int masaPanen) {
        this.masaPanen = masaPanen;
    }
    public int getLamaBertahan() {
        return this.lamaBertahan;
    }
    private void setLamaBertahan(final int lamaBertahan) {
        this.lamaBertahan = lamaBertahan;
    }
    public Buah(final String nama, final int jumlah, final int masaPanen, final int lamaBertahan) {
        this.setNama(nama);
        this.setJumlah(jumlah);
        this.setMasaPanen(masaPanen);
        this.setLamaBertahan(lamaBertahan);
    }
}
