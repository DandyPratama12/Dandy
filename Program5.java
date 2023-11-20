import  java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        //your code goes here
        Scanner Scanner = new Scanner(System.in);
        
        double bill = Scanner.nextDouble();
        double tip = bill * 0.15;
        System.out.print(tip);
    }
}