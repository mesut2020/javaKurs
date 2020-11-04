package Day24_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Mentoring_ArrayList_Soru3 {

    public static ArrayList<Integer> RandomEkleVeOrtakElemaniBul(ArrayList<Integer> a)
    {
        for (int i = 0; i < 6; i++) {
            a.add((int)(Math.random()*50+1));
        }
        Collections.sort(a);
        return(a);
    }

    public static void OrtakElemanlariKaldir(ArrayList<Integer> a, ArrayList<Integer> b){
        int c=0;
        ArrayList<Integer> ortak = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            if (b.contains(a.get(i))) {
                ortak.add(a.get(i)); c++;
            }
        }

        if(c==0) System.out.println("Ortak eleman yoktur...");
        else {
            a.removeAll(b);
            System.out.println("Ortak elemanlı yeni ArrayList : " +ortak);
            System.out.println("Ortak olanları çıkardıktan sonra Arraylist a : " + a);
        }
    }

    public static void main(String[] args) {
        /*
İki adet Integer ArrayList  a   ve   b oluşturun.   İkisi de 6 elemandan oluşmalı. (int arraylist a   ve     int arraylist   b )

RandomEkleVeOrtakElemaniBul isminde bir method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.
Eğer ortak eleman varsa, o eleman yazılsın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.

OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  a ' dan ,   a ile   b nin ortak elemanlarını çıkartsın ve  int arraylistin a yeni halini yazdırsın.

Ve bu iki methodu main methodunda çağırın.

todo Konsol şöyle olmalı     (Eğer ortak eleman varsa):
a  ilk hali :     [8, 24, 33, 35, 36, 43]
b ilk hali  :    [4, 14, 17, 36, 43, 44]

Ortak elemanlı yeni array: [36, 43]

Ortak olanları çıkardıktan sonra Arraylist a :  [8, 24, 33, 35]


todo Konsol şöyle olmalı (Eğer ortak elemanları yoksa);

a  ilk hali :     [17, 30, 30, 39, 46, 47]
b ilk hali  :    [11, 25, 25, 26, 28, 44]
Ortak eleman yoktur ...
 */
//        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a= new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            a.add(sc.nextInt());
//        }
//        System.out.println("Girilen liste : "+a);
        ArrayList<Integer> b = new ArrayList<>();

        System.out.println("a ilk hali : "+RandomEkleVeOrtakElemaniBul(a));
        System.out.println("b ilk hali : "+RandomEkleVeOrtakElemaniBul(b));


        // a.retainAll(b);      // a ile b deki ortak elemanlari a da birakir digerlerini siler...
        // System.out.println("a.retainAll(b) yazdiktan sonra" +a);

        OrtakElemanlariKaldir(a,b);

    }
}
