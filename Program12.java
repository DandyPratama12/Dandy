import java.util.Scanner;

public class Program12 {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        if (row >= 0 && row <seats.length && col >= 0 && col<seats[row].length){
            if (seats[row][col]==0){
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
    } else {
        System.out.println("Invalid seats selection");
    }
    sc.close();
    }
}