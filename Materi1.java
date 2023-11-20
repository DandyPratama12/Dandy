import java.util.Scanner;

public class Materi1 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String name, status;
        name = sc.nextLine();
        status = sc.nextLine();

        //output
        System.out.println("nama saya adalah = " +name );
        System.out.println("status saya adalah = " +status);

        String nama = sc.nextLine();
        System.out.println(nama);
        if ( nama.isEmpty() ){
            System.out.println(" bukan mahasiswa");
        } else {
            System.out.println("mahasiswa");
        }
    }
}
