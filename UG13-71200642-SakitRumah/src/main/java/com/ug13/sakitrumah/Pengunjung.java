package com.ug13.sakitrumah;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit=null;
    private int levelPenyakit = 2;
    private boolean status = false;

    public Pengunjung(String nama, int usia, String alamat) {
        this.nama=nama;
        this.usia=usia;
        this.alamat=alamat;
    }


    public Pengunjung(String nama, int usia, String alamat, String penyakit) {
        this.nama=nama;
        this.usia=usia;
        this.alamat=alamat;
        this.penyakit=penyakit;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public boolean getStatus() {
        return status;
    }
}
