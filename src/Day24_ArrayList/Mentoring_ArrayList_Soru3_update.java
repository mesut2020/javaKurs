package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Mentoring_ArrayList_Soru3_update {

    public static void RandomEkleVeOrtakElemaniBul(ArrayList<Integer> a,ArrayList<Integer> b)
    {
        for (int i = 0; i < 6; i++) {
            a.add((int)(Math.random()*50+1));
        }
        for (int i = 0; i < 6; i++) {
            b.add((int)(Math.random()*50+1));
        }
        Collections.sort(a);
        Collections.sort(b);

        System.out.println("a ilk hali = " + a);
        System.out.println("b ilk hali = " + b);

        int c=0;
        ArrayList<Integer> ortak = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            if (b.contains(a.get(i))) {
                ortak.add(b.get(i));
                c++;
            }
        }

        if(c==0) System.out.println("\nOrtak eleman yoktur...");

        else
            System.out.println("\nOrtak elemanlı yeni array: "+ ortak);

    }

    public static void OrtakElemanlariKaldir(ArrayList<Integer> a, ArrayList<Integer> b){
        int control = a.size();
        a.removeAll(b);
        if (control>a.size())System.out.println("\nOrtak olanları çıkardıktan sonra Arraylist a : "+a);
    }

    public static void main(String[] args) {
/*
İki adet Integer ArrayList  ( a ve b)    oluşturun. İkisi de 6 elemandan oluşmalı. (int arraylist a   ve     int arraylist   b )

RandomEkleVeOrtakElemaniBul isminde bir void method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.

Eğer ortak eleman varsa, bu ortak elemanları "Arraylist ortak" isminde başka bir arrayliste gönderin.
Ve "sadece ortak eleman varsa" bu arraylisti yazdırın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.

OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  eğer a ve b arasında ortak elemanlar varsa  a'dan b'deki elemanları çıkartsın.(Ortak elemanları cıkartsın)
ve a 'nın yeni halini (b 'den arınmış halini) konsola yazınız.
Eğer ortak elemanları yoksa hiçbir şey yazmasın.

Ve bu iki methodu main methodunda çağırın.

Konsol örneklerini dikkatlice inceleyin..

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

        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        RandomEkleVeOrtakElemaniBul(a,b);
        OrtakElemanlariKaldir(a,b);

    }
}
