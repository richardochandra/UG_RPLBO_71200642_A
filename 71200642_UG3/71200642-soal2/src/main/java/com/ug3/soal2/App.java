package com.ug3.soal2;
import java.util.* ;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        while (true){
            try {
                System.out.println("Lampu merah menyala selama");
                for (int i = 20; i > 0; i--)
                {

                    System.out.println(i);
                    TimeUnit.SECONDS.sleep(1);
                }
                System.out.println("Akan berganti ke lampu kuning\n");

                TimeUnit.SECONDS.sleep(2);

                System.out.println("Lampu kuning menyala selama");
                for (int i = 2; i > 0; i--)
                {
                    System.out.println(i);
                    TimeUnit.SECONDS.sleep(1);
                }
                System.out.println("Akan berganti ke lampu hijau\n");

                TimeUnit.SECONDS.sleep(1);

                System.out.println("Lampu hijau menyala selama");
                for (int i = 15; i > 0; i--)
                {
                    System.out.println(i);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
