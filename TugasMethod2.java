public class TugasMethod2  {
    public static void main(String[] args) {
        int  alas = 5;
        int tinggi = 8;

        double LuasSegitiga = jumlah(alas,tinggi);
        System.out.println("Luas Segitiga dari " + "alas "+ alas + " dan" + " tinggi " + tinggi + " adalah " + LuasSegitiga);
    }
    public static double jumlah(int alas, int tinggi ){
        double hasil =0.5 * alas * tinggi;
        return hasil;


    }

}