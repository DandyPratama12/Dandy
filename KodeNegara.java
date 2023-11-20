import java.sql.SQLOutput;
import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Negara = ");

        String KodeNegara = input.nextLine();

        if (KodeNegara.equals("ES")){
            System.out.print("ES adalah Kode Negara SPAIN ");
        } else if (KodeNegara.equals("TN")) {
            System.out.print("TN adalah Kode Negara TUNISIA ");
        } else if (KodeNegara.equals("ID")) {
            System.out.print("ID adalah Kode Negara INDONESIA ");
        } else if (KodeNegara.equals("MM")) {
            System.out.print("TM adalah Kode Negara MYANMAR ");
        } else if (KodeNegara.equals("IN")) {
            System.out.print("IN adalah Kode Negara INDIA ");
        } else {
            System.out.println("Maaf,Kode Negara Tidak Diketahui");
        }
    }
}