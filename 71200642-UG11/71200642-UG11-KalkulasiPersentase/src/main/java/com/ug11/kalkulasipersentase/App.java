package com.ug11.kalkulasipersentase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Masukan teks: ");
        Scanner inp = new Scanner(System.in);
        String text = inp.nextLine();
        String[] pisah = text.split(" ");

        ArrayList<String> simpan = new ArrayList<String>();
        for (String i:pisah) {
            if(i.endsWith("%")){
                simpan.add(i.split("%")[0]);
            }
        }

        String rincian ="";
        System.out.print("Rincian perhitungan: ");
                for (String i:simpan){
                    rincian+= (i+"% + ");}
        System.out.print(rincian.substring(0,rincian.length()-3));
        float total = 0;
        for (String i:simpan){
            total += Float.parseFloat(i);

        }
        System.out.println();
        System.out.println("Total kenaikan (Dalam Persen): "+total+"%");
    }
}
