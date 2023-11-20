import java.util.Scanner;

class Demo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;
        for (int x=1; x<= N; x++){
            fact *= x;
        }
        System.out.println(fact);
   }
}