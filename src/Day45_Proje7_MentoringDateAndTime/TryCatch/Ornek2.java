package Burak.TryCatch;

public class Ornek2 {
    public static void main(String[] args) {

        System.out.println("Kodumuz başlatılıyor...");

        int[] arr = new int[3];

        try {
            arr[4] = 10;
        }catch (ArrayIndexOutOfBoundsException arrayHatasi){
            System.out.println(arrayHatasi.getMessage());
        }


        System.out.println("Kodumuz bitiriliyor...");



    }
}
