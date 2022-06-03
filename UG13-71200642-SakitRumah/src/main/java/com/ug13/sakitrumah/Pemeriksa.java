package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) {
        if (pengunjung.getPenyakit() == null) {
            System.out.println("==========anda harus melakukan proses pendaftaran terlebih dahulu di bagian pelayanan==========");
        } else {

            if (pengunjung.getLevelPenyakit() <= 0) {
                pengunjung.setLevelPenyakit(0);
                pengunjung.setStatus(true);

            }
            else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit() - 1);
            }
        }

        }
        public void cekStatus (Pengunjung pengunjung){
            pengunjung.getStatus();
            if (pengunjung.getStatus()) {
                System.out.println("==========SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT==========");
            } else {
                System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
            }
        }
    }

