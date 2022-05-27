package com.ug12.aplikasistockbit;

import java.util.ArrayList;
import java.util.HashMap;

public class Stockbit {
    private ArrayList<Investor> arrInvestor = new ArrayList<Investor>();
    private Investor investor;

    public void login (String username, String  password) {
        int indek =0;
        for (Investor i : arrInvestor) {
            if (username.equals(i.getUsername()) && password.equals(i.getPassword())) {
                this.investor=i;
                System.out.println("Login berhasil");
                break;
            } else if (arrInvestor.size()-1 == indek){
                System.out.println("Username/Password Anda salah.");
            }
            indek+=1;
        }
    }

    public void orderBeli (Saham saham, int lot){
        investor.getPortofolio().put(saham, lot);
        System.out.println("Order beli "+saham.getKode()+" sebanyak "+lot+" sukses!");
    }

    public void printPortfolio(){
        System.out.println("===========Portfolio Client===========");
        System.out.println("Client: "+investor.getNama());
        System.out.println("No.\tKodeSaham\tJumlahLot\tHarga\tSubTotal");
        int angka =1;
        long invest = 0;
        for (Saham i : investor.getPortofolio().keySet()) {
            long total =0;
            total+=(investor.getPortofolio().get(i)*i.getHarga()*100);
            System.out.println(angka+"\t  "+i.getKode()+"\t\t\t"+investor.getPortofolio().get(i)+"  \t\t"+i.getHarga()+"  \t"+total);
            angka+=1;
            invest+=(investor.getPortofolio().get(i)*i.getHarga()*100);
        }
        System.out.println("Total Investasi : "+invest);
        System.out.println();
    }

    public void register (Investor investor){
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama "+ investor.getNama());
    }

    public void orderJual (Saham saham, int lot){
        int checker = investor.getPortofolio().get(saham);
        if (checker >= lot){
            investor.getPortofolio().put(saham,checker-lot);
            System.out.println("Order jual "+saham.getKode()+" sebanyak "+lot+" sukses!");
            if (checker == lot){
                investor.getPortofolio().remove(saham);
            }
        }
        else {
            System.out.println("Order jual gagal!");
        }
        }

    }

