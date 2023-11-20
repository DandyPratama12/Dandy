import java.util.Scanner;

public class BelajarUts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan Angka Pada 4 Variable a,b,c,d : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        double RataRata = a + b + c + d /4;
        System.out.println("Hasil Rata Rata : " + RataRata);
    }
}