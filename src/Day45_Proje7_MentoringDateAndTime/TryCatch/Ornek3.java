package Burak.TryCatch;

public class Ornek3 {
    public static void main(String[] args) {

        System.out.println("Kodumuz başlatılıyor...");

        int sayi = 0;
        int[] arr = new int[3];

        try {
            sayi = 2;  //En yukarıdaki hatayı aldığı için, o hatadan kurtulmalıyız.
            arr[4] = 10;

        }catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayHata){
            System.out.println(arrayHata.getMessage());
        }

        System.out.println("Kodumuz bitiriliyor...");
    }
}
