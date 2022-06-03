package com.ug13.sakitrumah;
import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama=nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung,Pemeriksa pemeriksa, Jadwal jadwal){
        jadwal.setPengunjung(pengunjung);
        jadwal.setPemeriksa(pemeriksa);
        jadwal.setStatusDaftar(true);
        System.out.println("==========proses pengaturan jadwal berhasil==========");

    }
    public Pengunjung registrasi(){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukan nama anda: ");
        String nama = myObj.nextLine();
        System.out.print("Masukan usia anda: ");
        int usia = Integer.parseInt(myObj.nextLine());
        System.out.print("Masukan alamat anda: ");
        String alamat = myObj.nextLine();
        System.out.print("Masukan penyakit anda: ");
        String penyakit = myObj.nextLine();
        Pengunjung pengunjung = new Pengunjung(nama,usia,alamat,penyakit);
        System.out.println("==========proses registrasi berhasil==========");
        return pengunjung;
    }
}
