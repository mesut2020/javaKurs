package Day44_TryCatch_FinalFinallyFinalize.TryCatch;

public class Finally1 {
    public static void main(String[] args) {

        try { // hatanın olma ihtimalini olduğu kodların alındığı blok
            // database i aç
            String str = "bugün";
            System.out.println("hatadan bir önceki adım");
            char ilkHarf = str.charAt(0); // hata olduğunda try ın içindeki sonraki bölümler çalışmaz
            System.out.println("hatadan bir sonraki adım");
        }
        catch (Exception ex) // hata olduğunda çalışacak kodlar bu bloğa yazılır
        {
            System.out.println("Catch bölümü çalıştı");
        }
        finally { // hata olsun veya olmasın çalışacak final bölümü: herzaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış işlemlerde arda kalan kapama gibi bu bölüme ait işlemler
            // yapılarak kod düzeni sağlanmış olur.
            System.out.println("Finaly bölümü çalıştı.");
            // database kapat.
        }
        System.out.println("tüm hata kodlarından sonraki normal kodların yazıldığı bölüm çalıştı.");

    }
}
