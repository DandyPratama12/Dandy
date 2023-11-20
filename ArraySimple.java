import java.util.Scanner;
public class ArraySimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah data : ");

        int jumlahdata = in.nextInt();
        int[] array = new int[jumlahdata];
        System.out.println("Inputkan data berikut : ");
        for (int x = 0; x < jumlahdata; x++) {
            System.out.print("Data ke - " + x + " : ");

        }
        for (int a= 0; a < jumlahdata; a++){
            if (array[a] % 2 == 0){
                System.out.println(array[a] + " ---> Bilangan genap ");
            } else {
                System.out.println(array[a] + " ---> Bilangan ganjil ");
            }
        }
        int Jumlah = 0;
        for (int c = 0; c < jumlahdata; c++){
            Jumlah = Jumlah + array[c];
        }
        System.out.println("Total Penjumlahan adalah : "+ Jumlah);
        double rerata = Jumlah / jumlahdata;
        System.out.println("RATA RATA : "+rerata);
    }
}
