import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah data : ");

        int jumdat = in.nextInt();
        int [] array = new int[jumdat];

        System.out.println("Inputkan data berikut : ");
        for (int a = 0; a < jumdat; a++){
            System.out.print("Data ke- " + a + " : ");
            array[a]= in.nextInt();
        }
        System.out.println("Menampilkan data : ");
        for (int a = 0; a < jumdat; a++){
            if (array[a] % 2 ==0){
                System.out.println(array[a] + " Bilangan genap");
            } else {
                System.out.println(array[a]+ " Bilangan ganjil");
            }
        }
        int hasil = 0;
        double ratarata = 0;
        for (int a = 0; a<jumdat; a++){
            hasil = hasil + array[a];
            ratarata = hasil / 6;
        }
        System.out.println("Total penjumlahan : "+ hasil);
        System.out.println("RATA RATA : "+ ratarata);
    }
}