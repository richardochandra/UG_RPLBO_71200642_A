package com.ug14.rumahsakit;

public class Pasien {
    private static int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit =1;
    private Boolean status = false;

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pasien(String nama, int usia, String alamat, String penyakit) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public Boolean getStatus() {
        return status;
    }

    public static int getRm() {
        return rm;
    }
}
