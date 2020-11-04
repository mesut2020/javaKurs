package Day29_Collections_SetAndMap;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<Integer, Integer> m = new java.util.HashMap<>();

        m.put(2, 11);
        m.put(3, 12);
        m.put(4, 13);
        m.put(2, 14);

        System.out.println("m.get(2) = " + m.get(2)); //2 anahtarindaki deger
        System.out.println("m.keySet() = " + m.keySet()); // key leri yazar...
        System.out.println("m.values() = " + m.values()); // degerler listesi...
        System.out.println(m);

        for (Integer ky: m.keySet()) {
            System.out.println("ky = " +ky);
        }

        for (Integer vl: m.values()) {
            System.out.println("vl = " +vl);
        }

        for (Map.Entry<Integer,Integer> keyVal: m.entrySet()) {
            System.out.print("KeyValue = " +keyVal);
            System.out.print("   keyVal.getValue() = " + keyVal.getValue());
            System.out.println();
        }

        boolean buAnahtarVarMi = m.containsKey(2);
        boolean buValueVarMI = m.containsValue(12);

        System.out.println("buValueVarMI = " + buValueVarMI);
        System.out.println("buAnahtarVarMi = " + buAnahtarVarMi);

        m.remove(2);
        System.out.println("m - remove 2 den sonra = " + m);

        int totalValue = 0;
        int totalKey = 0;
        for (Map.Entry<Integer, Integer> pair : m.entrySet()) {
            totalValue += pair.getValue();
            totalKey += pair.getKey();
        }
        System.out.println("TotalValue = " + totalValue+ "   TotalKey = " +totalKey);

        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            i += pair.getKey() + pair.getValue();
        }
        System.out.println("Total Value+Key = " + i);

        m.clear();
        System.out.println("m - clear dan sonra = " + m);
        
    }

}
