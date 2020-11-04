package Day43_StringBuilder_StringBuffer_JavaExceptions_TryCatch_MultiCatch.JavaException;

import java.util.Scanner;

public class TryCatch_2 {

    public static void main(String[] args) {

        String str = "bugun";
        int a = 5;
        int b =1;
        int c = 0;


        try {
            char ilkHarf = str.charAt(0);
            c = a/b;
            c=a+b;

        }

        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Hata : String dizisinin siniri asildi..." + e);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Hata : Aritmetik Exception hatasi olustu..." + e);
        }

        catch(Exception e)
        {
            System.out.println("Hata : Diger hatalar..." + e);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sayiyi giriniz : "+ sc.nextLine());
        System.out.println("2. Sayiyi giriniz : "+ sc.nextLine());
        System.out.println("3. Sayiyi giriniz : "+ sc.nextLine());




    }
}
