public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var LulusNIlaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && LulusNIlaiAkhir;

        System.out.println(lulus);

    }
}
