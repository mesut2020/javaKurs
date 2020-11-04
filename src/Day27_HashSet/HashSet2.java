package Day27_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();

        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");
        hs.add("red");
        hs.add("rED");
        hs.add("zzz");
        hs.add("Beep");
        hs.add("Zoom");

        // 1. Yol...
        System.out.println("hs = " + hs);

        // 2. Yol...
        for (String s:hs ) {
            System.out.println("s = "+ s);
        }

        //3. yol... Daha hizli calisir
        Iterator gosterge = hs.iterator();
        // System.out.println(gosterge.next()+" "+gosterge.hasNext());
        while(gosterge.hasNext()) // sonrasi varsa
        {
            System.out.println("Sonraki elemena = " +gosterge.next());
            gosterge.remove(); // o anda gosterdigi elemani silebiliyor
        }

        System.out.println("Yukarida hepsini sildi : "+hs);

        hs.remove("Red"); // bir eleman siler...
        hs.clear(); // set i temizler...


    }
}
