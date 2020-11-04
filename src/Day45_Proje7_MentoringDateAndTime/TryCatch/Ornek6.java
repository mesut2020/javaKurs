package Burak.TryCatch;

import java.util.IllegalFormatException;

public class Ornek6 {

// todo
//    ArithmeticException	                Aritmatiksel bir işlem sırasında oluşan hata
//    ArrayIndexOutOfBoundsException	    Array sınırlarından çıkılma hatası
//    ArrayStoreException	                Array yapısına uymayan bir değer kaydedilmeye çalışıldığında
//    ClassCastException	                Uygunsuz class atama işlemi
//    IllegalArgumentException	            Uygun olmayan argüman kullanımı
//    IllegalMonitorStateException	        Uygun olmayan monitör işlemi
//    IllegalStateException	                Sistemin uygun pozisyonda olmadığını belirtir
//    IllegalThreadStateException	        Tread durumunun uygun olmadığını belirtir
//    IndexOutOfBoundsException	            Index'in sınırlardan çıkılma hatası
//    NegativeArraySizeException	        Array'in boyutuna negatif değer verilmiş olması hatası
//    NullPointerException	                Boş pointer hatası
//    NumberFormatException	                Uygun olmayan sayı formatı hatası
//    SecurityException	                    Güvenlik hatası
//    StringIndexOutOfBounds	            String yapısının sınırlarından çıkma hatası
//    UnsupportedOperationException	        Desteklenmeyen işlem hatası
//    ClassNotFoundException	            Class bulunmama hatası
//    CloneNotSupportedException	        Çoğalmaya çalışılan bir objenin çoğalamayacağını belirten hata
//    IllegalAccessException	            Uygunsuz erişim hatası
//    InstantiationException	            Bir objenin oluşturulması esnasında oluşan hata
//    InterruptedException	                Bir tread'in diğer tread'i durdurma hatası
//    NoSuchFieldException	                Aranılan alanın olmadığı hatası
//    NoSuchMethodException             	Kıllanılan methodun bulunmama hatası

    public static void main(String[] args) {
        try {
            throw new RuntimeException("1");
        }
//        catch(RuntimeException e){
//            System.out.println("Hata yakalandi");
//            int a = 10;
//            System.out.println(a);
//            throw new ArithmeticException("2");
//            //System.out.println(a+1);
//        }
        catch(Exception e) {
            System.out.println("2. catch ici : "+e);
        }
        finally{
            throw new ArithmeticException("AE");
        }
    }
}
