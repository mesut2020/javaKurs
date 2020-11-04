package Day27_HashSet;

import java.util.HashSet;

public class HashSet3 {

    public static HashSet<Integer> kesisimiBul(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(a);
        hs.retainAll(b);
        return hs;
    }

    public static HashSet<Integer> farkiBul(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(a);
        hs.removeAll(b);
        return hs;
    }

    public static HashSet<Integer> birlestir(HashSet<Integer> a, HashSet<Integer> b)
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(a);
        hs.addAll(b);
        return hs;
    }

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("a = " +setA);
        System.out.println("b = " + setB);

        System.out.println("a+b = " +birlestir(setA,setB));
        System.out.println("a-b = " +farkiBul(setA,setB));
        System.out.println("a kesisim b = " +kesisimiBul(setA,setB));

    }


}
