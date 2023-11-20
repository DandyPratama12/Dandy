import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int modal = input.nextInt();
        int PersenKeuntungan = input.nextInt();
        System.out.println("Modal = " + modal);
        System.out.println("PersenKeuntungan= "+ PersenKeuntungan +"%");
    
        double Profit = modal + (modal * PersenKeuntungan);
        System.out.println(Profit);
    }
    
}
