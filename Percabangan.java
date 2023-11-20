import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seminggu = input.nextInt();
        int jam = input.nextInt();
        int JumlahJamKerja = seminggu * jam;
        System.out.println("Jumlah Jam dalam seminggu adalah = "+ JumlahJamKerja);
        input.close();

        int UpahPerJam = 2000;
        int hasil = jam * UpahPerJam;
        System.out.println("Jumlah Upah Perjam = "+ hasil);

        if (JumlahJamKerja > 48){
            System.out.println("Upah Lmebur");
        }

    }
}