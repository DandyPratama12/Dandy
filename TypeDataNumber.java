public class TypeDataNumber {
    public static void main(String[] args) {

        // ini interger number
        byte inibyte = 100;
        short inishort = 1000;
        int iniint = 1000000;
        long inilong = 1000000;
        long inilong2 = 1000000L;

        // ini floating number
        float inifloat = 10.10F;
        double inidouble = 10.10;

        // ini kode : literals
        int decimalInt = 34;
        int hexInt = 0xFFFF;
        int binaryDecimal = 0b101010;

        // ini kode : underscore
        long mount = 1_000_000_000_000L;
        int sum = 70_000_000;

        // ini adalah Konversi tipe data
        // Widening casting(otomatis)
        byte iniByte = 20;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // ini adalah konversi tipe data
        // Narrowing casting(manual)
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
    }
}
