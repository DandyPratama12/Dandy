import java.util.Scanner;

public class SwitchKodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print   ("Masukkan Kode Negara = ");

        String KodeNegara = input.nextLine();

        switch (KodeNegara){
            case"ES":
                System.out.print("Negara SPAIN ");
                break;
            case "TN":
                System.out.print("Negara TUNISIA");
                break;
            case "ID":
                System.out.print("Negara INDONESIA");
                break;
            case "MM":
                System.out.print("Negara MYANMAR");
                break;
            case "IN":
                System.out.print("Negara INDIA");
                break;
            default:
                System.out.print("Maaf,Kode Negara Tidak Diketahui ");
        }
    }
}
