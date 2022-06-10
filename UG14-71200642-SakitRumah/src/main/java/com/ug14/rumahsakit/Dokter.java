package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal) {
        if (pasien.getPenyakit() == null) {
            System.out.println("==========anda harus melakukan proses pendaftaran terlebih dahulu di bagian pelayanan==========");
        } else {

            if (pasien.getLevelPenyakit() <= 0) {
                pasien.setLevelPenyakit(0);
                pasien.setStatus(true);

            } else {
                pasien.setLevelPenyakit(pasien.getLevelPenyakit() - 1);
            }
        }

    }

    public void cekStatus(Pasien pasien, Jadwal jadwal) {
        pasien.getStatus();
        if (pasien.getStatus()) {
            System.out.println("==========SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT==========");
            System.out.println("Status pasien berhasil diubah!");
        } else {
            System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
        }
    }
}
