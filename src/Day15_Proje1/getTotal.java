package Day15_Proje1;

import java.util.Scanner;

public class getTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        String str1=oku.next();
        String str2=oku.next();
        String str3=oku.next();

        String sayi1=str1.replaceAll("[^0-9, -]", "");
        String sayi2=str2.replaceAll("[^0-9, -]", "");
        String sayi3=str3.replaceAll("[^0-9, -]", "");

        int a=Integer.parseInt(sayi1);
        int b=Integer.parseInt(sayi2);
        int c=Integer.parseInt(sayi3);
        int toplam=a+b+c;

        if (toplam<0) System.out.println(-1);
        else System.out.println(toplam);



    }
}
