package Burak.TryCatch;

public class Ornek1 {
    public static void main(String[] args) {

        //todo           try-catch
        //todo        try = dene       catch = yakala

        System.out.println("Kodumuz çalışmaya başlıyor....");
        int sayimiz = 0;

        try {
            sayimiz = 2/0;
            System.out.println("Bu String Try'ın içindedir.");
//todo            Hatayı gördüğü gibi try'ın içini komple yok sayıyor.
        }catch (ArithmeticException bolmeHatasi){
            System.out.println(bolmeHatasi.getMessage());
        }

        System.out.println(sayimiz);
        System.out.println("Kodumuz bitiyor....");

//todo        try-catch hata yapıldığı halde
//                 programı çalıştırmaya devam ediyor.

    }

}
