import java.sql.SQLOutput;
import java.util.Scanner;

public class Huruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Huruf = ");

        char nilaiHuruf = input.next().charAt(0);

        double nilaiNumerik;

        if (nilaiHuruf == 'A') {
            System.out.print(nilaiNumerik = 4.0);
        } else if (nilaiHuruf == 'B') {
            System.out.print(nilaiNumerik = 3.0);
        } else if (nilaiHuruf == 'C') {
            System.out.print(nilaiNumerik = 2.0);
        } else if (nilaiHuruf == 'D') {
            System.out.print(nilaiNumerik = 1.0);
        } else if (nilaiHuruf == 'E') {
            System.out.print(nilaiNumerik = 0);
        } else {
            System.out.println("Maaf,Konversi nilai tidak diketahui");
        }
    }
}
