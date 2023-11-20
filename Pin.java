import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        String pin = "0987";
        int maksimalbatas = 3;
        int bataskesempatan = 0;

        Scanner scanner = new Scanner(System.in);
        while (bataskesempatan < maksimalbatas) {
            System.out.print("Masukkan 4 Digit PIN = ");
            String inputPin = scanner.nextLine();

            if (inputPin.equals(pin)) {
                System.out.println("PIN yang Anda masukkan benar.");
                break;
            } else {
                bataskesempatan++;
                System.out.println("PIN yang Anda masukkan salah. Sisa percobaan anda: " + (maksimalbatas-bataskesempatan));
            }
        }

        if (bataskesempatan >= maksimalbatas) {
            System.out.println("Anda telah melebihi batas maksimal percobaan.Tunggu 4 jam lagi .");
        }
    }
}