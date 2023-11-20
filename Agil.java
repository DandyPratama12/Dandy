import java.util.Scanner;

public class Agil {
    public static void main(String[] args) {
        String pin = "1107";
        int makstebak = 3;
        int tebak = 0;

        Scanner scanner = new Scanner(System.in);
        while (tebak < makstebak) {
            System.out.print("Masukkan PIN 4 digit: ");
            String inputPin = scanner.nextLine();

            if (inputPin.equals(pin)) {
                System.out.println("PIN yang Anda masukkan benar. Akses diberikan.");
                break;
            } else {
                tebak++;
                System.out.println("PIN yang Anda masukkan salah. Sisa percobaan: " + (makstebak-tebak));
            }
        }

        if (tebak >= makstebak) {
            System.out.println("Anda telah melebihi batas maksimal percobaan.Tunggu 4 jam lagi .");
        }
    }
}

