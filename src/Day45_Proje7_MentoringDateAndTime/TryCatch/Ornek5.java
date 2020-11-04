package Burak.TryCatch;

public class Ornek5 {
    public static void main(String[] args) {

        System.out.println("Başlatılıyor....");

        int a = 0;

        try{
            a = 2/0;
        }catch (Exception hata){
            hata.printStackTrace();
        }
        System.out.println("Bitiriliyor..."); //Hata kodunu ayrıntılı şekilde gösteriyor.

    }
}
