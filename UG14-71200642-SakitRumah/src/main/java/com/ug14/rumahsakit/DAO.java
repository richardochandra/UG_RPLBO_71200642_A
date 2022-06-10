package com.ug14.rumahsakit;
import java.sql.*;

public class DAO {
    private String URL= "jdbc:sqlite:rumahsakit.db";


    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Koneksi berhasil.");
            } catch (SQLException e) {
            System.out.println(e.getMessage());
            } finally {
            try {
                if (conn != null) {
                    conn.close();
                    }
                } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                }
            }
        return conn;
        }

    public Dokter getDokterByID(Dokter dokter){

        return dokter;
    }
    public Suster getSusterByID(Suster suster){
        return suster;
    }
    public Pelayanan getPelayananByID(Pelayanan pelayanan){
        return pelayanan;
    }
    public static Pasien getPasienSembuh(){
        System.out.println(Pasien.getRm());
        return null;
    }
}
