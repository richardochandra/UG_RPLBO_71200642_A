import java.util.*;

public class UG2_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        TabunganKonvensional K_71200642 = new TabunganKonvensional();
        TabunganBerjangka I_71200642 = new TabunganBerjangka();
        System.out.println("Pilihan:");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        System.out.println("Masukan Pilihan: ");
        int pilihan = inp.nextInt();

        if (pilihan == 1) {
            K_71200642.penyetoran(200000);
            I_71200642.penyetoran(1000000);
        }
        else if (pilihan == 2) {
            K_71200642.penarikan(50000);
            I_71200642.penarikan(0);
        }
        else if (pilihan == 3) {
            System.out.println("Saldo K_71200642:");
            K_71200642.getSaldo();
            System.out.println("Saldo I_71200642:");
            I_71200642.getSaldo();
        }
        else {
            System.out.println("input tidak valid");
        }
    }
}
