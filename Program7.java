import  java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
       
        int boxnumber;

        switch(color){
            case "red":
            boxnumber= 1;
            break;
            case "green":
            boxnumber= 2;
            break;
            case "black":
            boxnumber = 3;
            break;
            default:
            boxnumber = -1;
            break;
        }
        if(boxnumber != -1){
            System.out.println(boxnumber);
        } else {
            System.out.println("unknown color");
           
        }
    }
}