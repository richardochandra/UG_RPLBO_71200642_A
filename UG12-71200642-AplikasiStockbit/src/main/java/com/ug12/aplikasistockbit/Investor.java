package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor {
    private String username;
    private String password;
    private HashMap<Saham, Integer> portofolio = new HashMap<Saham, Integer>();
    private String nama ;

    public Investor(String nama,String username, String password) {
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HashMap<Saham, Integer> getPortofolio() {
        return portofolio;
    }

    public String getNama() {
        return nama;
    }
}
