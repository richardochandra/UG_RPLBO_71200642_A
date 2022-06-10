package com.ug14.rumahsakit;
import java.util.Scanner;

public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        jadwal.setPasien(pasien);
        jadwal.setDokter(dokter);
        jadwal.setStatusDaftar(true);
        System.out.println("==========proses pengaturan jadwal berhasil==========");

    }
    public Pasien registrasi(){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukan rm baru: ");
        int rm = Integer.parseInt(myObj.nextLine());
        System.out.print("Masukan nama anda: ");
        String nama = myObj.nextLine();
        System.out.print("Masukan usia anda: ");
        int usia = Integer.parseInt(myObj.nextLine());
        System.out.print("Masukan alamat anda: ");
        String alamat = myObj.nextLine();
        System.out.print("Masukan penyakit anda: ");
        String penyakit = myObj.nextLine();
        Pasien pasien = new Pasien(nama,usia,alamat,penyakit);
        System.out.println("==========proses registrasi berhasil==========");
        System.out.println("data pasien berhasil disimpan");
        return pasien;
    }


}
