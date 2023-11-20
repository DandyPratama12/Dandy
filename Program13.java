import java.util.Scanner;

public class Program13 {

    public static void bot(){
        Scanner scanner = new Scanner(System.in);


        int userinput = scanner.nextInt();

        if (userinput == 1){
            System.out.println("Order confirmed");
        } else if (userinput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        bot();
    }
}    