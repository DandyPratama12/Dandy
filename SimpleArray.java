import java.util.Scanner;
public class SimpleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah data : ");

        int jumlahdata = in.nextInt();
        int []array = new int[jumlahdata];
        System.out.println("Inputkan data berikut : ");
        for (int a = 0; a < jumlahdata; a++){
            System.out.print("Data ke- " + a + "; ");
            array[a] = in.nextInt();
        }
        for (int c = 0; c < jumlahdata ; c++){
            if (array[c] % 2 == 0){
                System.out.println(array[c] + "Ini adalah angka GENAP");
            }else{
                System.out.println(array[c] + " ini adalah angka GANJIL");
            }
        }
        int j = 0;
        for (int e = 0; e < jumlahdata ; e++){
            j = j + array[e];
        }
        System.out.println("jumlah adalah " + j);
        double hasil = j / jumlahdata;
        System.out.println("rata rata = " + hasil);
    }
}