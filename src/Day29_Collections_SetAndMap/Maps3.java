package Day29_Collections_SetAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps3 {
    public static void main(String[] args) {
        // HashMap, LinkedHashMap, TreeMap

        // Hash algorithmasina gore siraladi...
        Map<Integer, String> hm = new HashMap<>();
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(3,"dog");
        hm.put(4,"swan");
        hm.put(7,"bear");
        hm.put(1,"snake");
        System.out.println("hm = " + hm);

        // Ekleme sirasina gore saklar
        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(9,"fox");
        lhm.put(2,"cat");
        lhm.put(3,"dog");
        lhm.put(4,"swan");
        lhm.put(7,"bear");
        lhm.put(1,"snake");
        System.out.println("lhm = " + lhm);

        Map<Integer, String> tm = new TreeMap<>();
        tm.put(9,"fox");
        tm.put(2,"cat");
        tm.put(3,"dog");
        tm.put(4,"swan");
        tm.put(7,"bear");
        tm.put(1,"snake");
        System.out.println("tm = " + tm);

    }
}
