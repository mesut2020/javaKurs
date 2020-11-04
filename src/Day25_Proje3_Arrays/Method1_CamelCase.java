package Day25_Proje3_Arrays;

import java.util.Scanner;

public class Method1_CamelCase {

    public static String camelcase(String str){
        String[] kelimeler = str.split("[ ]+"); // " " bir bosluga gore, "[ ]+" bir veya birden fazla bosluga gore kelimelere ayirir.
        String mesaj="";

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i] = kelimeler[i].substring(0,1).toUpperCase() + kelimeler[i].substring(1);
            //kelimeler[i] = Character.toUpperCase(kelimeler[i].charAt(0)) + kelimeler[i].substring(1);// 'substring(0,1)' yerine 'charAt(0)' da kullanilabilir...
        }

        for (int i = 0; i < kelimeler.length; i++) {
            mesaj += kelimeler[i];

            if (i < kelimeler.length-1)    // sonuna bosluk koymamasi icin -1
                mesaj += " ";
        }
        return mesaj;
    }

    public static void main(String[] args) {
        /* camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
        büyük harfe çevirip geri döndüren metodun yazınız.
        Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel */

        Scanner sc = new Scanner(System.in);

        System.out.println(" Bir cumle gir = ");
        String text = sc.nextLine();

        System.out.println(camelcase(text));
    }
}
