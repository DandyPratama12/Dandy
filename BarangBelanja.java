import java.util.Scanner;

public class BarangBelanja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input jumlah barang belanja ");
        int[] jumlahbelanja = new int[5];
        int[] array = {2500,3000,4000,5000,6000};

        for (int a = 0; a < array.length; a++){
            System.out.print("Jumlah data ke item-"+ a +" Rp" + array[a] + " : ");
            jumlahbelanja[a] = in.nextInt();
        }
        int Harga;
        System.out.println("Daftar harga dan belanja : ");
        for (int b = 0; b < array.length; b++){
            Harga = array[b] * jumlahbelanja[b];
            System.out.println("Harga barang ke- " + b + "," + array[b]+ "," + jumlahbelanja[b]+ " item : " + Harga);
        }
        int total=0;
        for (int x =0; x < jumlahbelanja.length; x++){
            total = total + jumlahbelanja[x];
        }
       int belanja = 0;
        for (int d = 0; d < 5; d++){
            belanja = belanja + array[d] *  jumlahbelanja[d];
        }
        System.out.println("TOTAL ITEM BELANJA : "+ total);
        System.out.println("TOTAL BELANJA : "+ belanja);
    }
}
