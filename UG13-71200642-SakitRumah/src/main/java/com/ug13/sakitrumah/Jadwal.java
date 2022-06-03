package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public Pengunjung getPengunjung() {
        return pengunjung;
    }
}
