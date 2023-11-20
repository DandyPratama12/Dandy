import java.util.Scanner;

public class Program15 {
    static double fahr(double celcius){
        double Fahrenheit = 1.8 * celcius + 32;
        return Fahrenheit;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}