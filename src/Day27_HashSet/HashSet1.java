package Day27_HashSet;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        // Array -> ArrayList -> Set
        // Collections
        // HashSet : Kendine gore bir algortithma ile siralayarak sakliyor...
        // LinkedHashSet : Kullanicinin ekleme sirasina gore sakliyor
        // TreeSet : heri veri girildiginde tum verileri kucukten buyuge siralayarak sakliyor.
        // Avantaji : ayni elemani iki kez eklemiyor.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("List = "+list );

        // Set<Integer> hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();
        hs.add(8);
        hs.add(4);
        hs.add(3);
        hs.add(3);
        hs.add(2);

        boolean eklediMi_1= hs.add(2);
        boolean eklediMi_2= hs.add(5);



        System.out.println("Tekrar 2 yi ekledi mi = " +eklediMi_1);
        System.out.println("5 i ekledi mi = " +eklediMi_2);

        System.out.println("hs = "+ hs);

    }
}
