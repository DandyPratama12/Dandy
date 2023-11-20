import java.util.Scanner;

public class TugasAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String Nama = input.nextLine();
        System.out.println("1. Luas Persegi Panjang ");
        System.out.println("2. Luas Segitiga ");

        System.out.print("Pilih nomor rumus : ");
        int nomor = input.nextInt();

        System.out.print("Alas : ");
        int alas = input.nextInt();

        System.out.print("Tinggi : ");
        int tinggi =input.nextInt();

        double hasil = alas * tinggi / 2;
        System.out.println("Halo Dandy. Luas Segitiga yang anda cari adalah " + hasil);



    }
}