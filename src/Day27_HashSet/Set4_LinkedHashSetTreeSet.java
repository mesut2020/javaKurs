package Day27_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set4_LinkedHashSetTreeSet {

    public static void main(String[] args) {
        // HashSet, LinkedHashSet, TreSet
        // Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // Eklenme sırasına göre
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //Alafabetik soraya göre her eklemede saklar
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        // Sayisal siraya gore her eklemede saklar...
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);
        System.out.println("ts2 = " + ts2);

        HashSet<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            hs2.add((int)(Math.random()*10));
        }
        System.out.println(hs2);
        ArrayList<Integer> arrList = new ArrayList<>(hs2);
        System.out.println(arrList);
        ts2.addAll(arrList);
        System.out.println(ts2);
    }
}
