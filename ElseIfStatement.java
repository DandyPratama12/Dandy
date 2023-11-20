public class ElseIfStatement {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 80;
        // if digunakan ketika nilai TRUE sistem akan berjalan, jika Bernilai FALSE  maka sistem akan kosong atau
        //tidak berjalan
        if (nilai >= 75 && absen >= 80){
            System.out.println("Nilai Anda adalah A");
        // jika menggunakan else if, berarti dia masik berkemungkinan akan TRUE
        } else if(nilai >= 70 && absen >= 75){
            System.out.println("Nilai Anda adalah B");
        } else if (nilai >= 65 && absen >= 70){
            System.out.println("Nilai Anda adalah C");
        } else if (nilai >= 60 && absen >= 65) {
            System.out.println("NIlai Anda adalah D");
        } else if (nilai >= 55 && absen >= 60) {
            System.out.println("NIlai Anda adalah E");
         // Jika sudah menggunakan ELSE saja , berarti nilai sudah habis atau sudah mentok
        } else {
            System.out.println("Anda Tidak Lulus");
        }
    }
}