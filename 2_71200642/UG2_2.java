import java.util.*;

public class UG2_2
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa karyawan: ");
        int jmlLoop = inp.nextInt();

        for (int i=1;i<=jmlLoop;i++){
        System.out.println("Masukan jumlah jam kerja: ");
        int totJamKerja = inp.nextInt();
        if (totJamKerja == 8){
            int total = 8 * 300000;
            System.out.println("Total");
            System.out.println(total);
        }
        else if (totJamKerja < 8){
            int total = (totJamKerja * 285000);
            System.out.println("Total");
            System.out.println(total);
        }
        else if (totJamKerja > 8){
            int total = (totJamKerja * 315000);
            System.out.println("Total");
            System.out.println(total);
        }
        }
    }
}