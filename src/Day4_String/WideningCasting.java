package Day4_String;

public class WideningCasting {
    public static void main(String[] args) {

//        byte -> short -> char -> int -> long -> float -> double ; otomatik dönüşüm

        int sayi = 9;
        double rakam = sayi;
        int f = (int)rakam;

        System.out.println("rakam = " + f);

    }
}
