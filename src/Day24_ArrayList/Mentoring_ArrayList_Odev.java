package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Mentoring_ArrayList_Odev {
    public static ArrayList<String> elemanEkle(){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> strArrList = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ". elemanı giriniz:  ");
            strArrList.add(sc.nextLine());
        }
        return strArrList;
    }

    public static void sil(ArrayList<String> strArrList){
        int c=0;
        for (int i = 0; i < strArrList.size(); i++) {
            String str = strArrList.get(i);
            if (str.contains("l")) {
                System.out.println(" l harfi bulunanlar : " + str);
                c++;
            }
        }
        if (c>0) {
            strArrList.clear();
            System.out.println("Liste bosaltilmistir...");
        }
    }

    public static void listBosMu(ArrayList<String> strArrList){
        System.out.println("ArrayList bos mu? = " +strArrList.isEmpty());
        if (strArrList.isEmpty()) System.out.println("ArrayList'im bostur = " +strArrList);
        else System.out.println("ArrayList'im doludur = " +strArrList);
    }

    public static void main(String[] args) {
/*
String arrayList oluşturun. 5 elemandan oluşturun.

1.   elemanEkle isminde bir method oluşturun
 ve bana String Arraylist döndürsün. Parametre olarak String arraylist.
Scanner kullanarak  5 özel isim girin ve bu isimler bu methodda ArrayListe eklensin. (Hüseyin, Ömer,Nalan vb.)


2.    sil    isminde void bir method çağırın.
 Parametresi String ArrayList olsun.
ArrayListimin içindeki elemanlar "l" (en az bir eleman  "küçük L"  harfine sahip olması koşul için yeterlidir.) harfine sahipse, bütün arrayList temizlensin. (silinsin, boşaltılsın.)

3.    listeBosMu   adında void bir method oluşturun.
ve  parametresi    String  ArrayList olsun.
Listenin boş olup olmadıgını check etsin. Liste boş ise true,  boş değil ise false döndürsün.  (ArrayList methodu kullanın.)
Liste boş ise  listeyi yazdırıp check edin.


Konsoldaki görüntü bunun gibi olmalı(Kendi değerlerinizi girerek deneyin)

1. elemanı giriniz:  ömer
2. elemanı giriniz:  hüseyin
3. elemanı giriniz:  nalan
4. elemanı giriniz:  sevket
5. elemanı giriniz:  osman
[ömer, hüseyin, nalan, sevket, osman]

L harfi bulunanlar : nalan
Liste boşaltılmıştır...

ArrayList boş mu ? =    true
Arraylist'im boştur =   []

 */
        ArrayList<String> strList = new ArrayList<>(elemanEkle());
        System.out.println(strList);

        sil(strList);

        listBosMu(strList);



    }
}
