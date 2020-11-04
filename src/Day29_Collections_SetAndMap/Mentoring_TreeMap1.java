package Day29_Collections_SetAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mentoring_TreeMap1 {

     /*
        10, Java
        20, PHP
        2, Python
        57, C++
        89, C#
        40, Javascript
         */

    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        Map<Integer,String>linkedHashMap=new LinkedHashMap<Integer, String>();
        Map<Integer,String>treeMap=new TreeMap<Integer, String>();

        hashMap.put(10,"Java");
        hashMap.put(20,"PHP");
        hashMap.put(2,"Python");
        hashMap.put(57,"C++");
        hashMap.put(89,"C#");
        hashMap.put(40,"JavaScript");

        hashMap.replace(89,"C++");


        for (Map.Entry<Integer,String>entry:hashMap.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("*******************************************************************");

        linkedHashMap.put(10,"Java");
        linkedHashMap.put(20,"PHP");
        linkedHashMap.put(2,"Python");
        linkedHashMap.put(57,"C++");
        linkedHashMap.put(89,"C#");
        linkedHashMap.put(40,"JavaScript");


        for (Map.Entry<Integer,String>entry:linkedHashMap.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("*******************************************************************");

        treeMap.put(10,"Java");
        treeMap.put(20,"PHP");
        treeMap.put(2,"Python");
        treeMap.put(57,"C++");
        treeMap.put(89,"C#");
        treeMap.put(40,"JavaScript");


        for (Map.Entry<Integer,String>entry:treeMap.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("*******************************************************************");
    }
}
