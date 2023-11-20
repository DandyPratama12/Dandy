// Digunakan untuk mengimpor class Scanner yang terdapat
import java.util.Scanner;

public class LuasSegitiga {

    public static void main(String[] args) {
        // Menggunakan Scannner untuk bisa menginput data
        Scanner input = new Scanner(System.in);

        // Tidak perlu membuat int variable 1 per satu
        int a, t;
        double luas;

        System.out.print("masukan alas :");


        a=input.nextInt();
        System.out.print("Masukan tinggi :");

        t= input.nextInt();

        // kenapa a*t/ 2?, Dikarenakan itu ada lah rumus dari segitiga
        luas=a*t/ 2;
        System.out.print("Luas Segitiga adalah :"+luas);

    }
}
