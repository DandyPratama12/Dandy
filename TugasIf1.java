import java.util.Scanner;

public class TugasIf1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lama Kerja Sehari");

        int x = input.nextInt();
        int f = x * 7;
        int upah = f * 2000;

        if (f > 48){
            int jam = f - 48;
            int lembur = (48 * 2000)+(3000 * jam );
            System.out.println("lama kerja seminggu " + f + " jam");
            System.out.println(" upah mingguan = " + lembur);
            System.out.println(" napo ang lembur ");
        } else {
            System.out.println("lama kerja seminggu " + f + " jam");
            System.out.println(" upah mingguan = " + upah);
            System.out.println(" korup ajalah ganteng ");


        }
    }
}
