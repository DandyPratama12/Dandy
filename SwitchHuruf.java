import java.util.Scanner;

public class SwitchHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Huruf = ");

        char nilaiHuruf = input.next().charAt(0);

        double nilaiNumerik;

        switch (nilaiHuruf){
            case 'A':
                nilaiNumerik = 4.0;
                break;
            case 'B':
                nilaiNumerik = 3.0;
                break;
            case 'C':
                nilaiNumerik = 2.0;
                break;
            case 'D':
                nilaiNumerik = 1.0;
                break;
            case 'E':
                nilaiNumerik = 0;
                break;
            default:
                System.out.print("Maaf,konversi nilai tidak diketahui ");
        }
    }
}
