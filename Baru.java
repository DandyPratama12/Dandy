import java.util.Scanner;

public class Baru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input jumlah barang belanja");
        int [] jumlahbelanja = new int[5];
        int [] array = {2500,3000,4000,5000,6000};

        for (int a = 0; a < array.length; a++ ){
            System.out.print("Jumlah belanja item-"+a+ " Rp "+ array[a] + " : ");
            jumlahbelanja[a]= in.nextInt();
        }
        int harga;
        System.out.println("Daftar belanja dan harga ");
        for (int a = 0; a < array.length; a++){
            harga = array[a] * jumlahbelanja[a];
            System.out.println("Harga barang ke-"+ a + " , " + array[a] + " , " + jumlahbelanja[a] +" item :"+ harga );
        }
        int total = 0;
        for (int a= 0;  a < array.length; a++){
            total = total + jumlahbelanja[a];
        }
        int hasil=0;
        for (int a = 0; a < array.length; a++){
            hasil = hasil + array[a] * jumlahbelanja[a];
        }
        System.out.println("TOTAL ITEM BELANJA : "+ total);
        System.out.println("TOTAL BELANJA : "+ hasil);
    }
}