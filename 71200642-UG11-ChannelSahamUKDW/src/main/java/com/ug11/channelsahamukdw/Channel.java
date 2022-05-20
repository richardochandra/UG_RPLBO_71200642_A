package com.ug11.channelsahamukdw;


import java.util.ArrayList;
import java.util.Arrays;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;

    public void login(String email) throws EmailException {

        String[] pisah1 = email.split("@");
        String[] pisah2 = pisah1[0].split("[.]");
        try {
            if (!pisah1[1].equals("students.ukdw.ac.id")) {
                throw new EmailException(1);
            }
            else if ((pisah2.length != 2) && pisah1[1].equals("students.ukdw.ac.id")){
                throw new EmailException(2);
            }
            else {
                System.out.println("Login berhasil!");
                this.namaDepan=pisah2[0];
                this.namaBelakang=pisah2[1];
                this.email=email;
            }
        }catch (EmailException e){
            System.out.println(e.getErrorMessage());
        }

    }
    public void bagikanIde(String ide){
        System.out.println(ide);
        String[] pisah = ide.split(" ");
        ArrayList<String> simpan = new ArrayList<String>();
        String tag = "";
        for (String i:pisah) {
            if(i.startsWith("#")){
                simpan.add(i);
            }
        }
        totalTag += simpan.size();
        for(String i:simpan){
            tag +=i;
        }
        System.out.println("Saham yang anda tag: "+tag);

    }

    public void printInfo(){
        System.out.println("Nama Depan: "+ namaDepan);
        System.out.println("Nama Belakang: "+ namaBelakang);
        System.out.println("Email: "+ email);
        System.out.println("Total Tag: "+ totalTag);

    }
}
