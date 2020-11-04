package Day29_Collections_SetAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mentoring_TreeMap2_methods {

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
        Map<Integer,String>linkedHashMap=new LinkedHashMap<>();
        Map<Integer,String>treeMap=new TreeMap<>();

        printMap(hashMap);
        printMap(linkedHashMap);
        printMap(treeMap);
    }

    public static void createMap(Map<Integer,String>map) {
        map.put(10, "Java");
        map.put(20, "PHP");
        map.put(2, "Python");
        map.put(57, "C++");
        map.put(89, "C#");
        map.put(40, "Javascript");
    }

    public static void printMap (Map < Integer, String > map){
        createMap(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Keys= " + entry.getKey() + " value= " + entry.getValue());
        }
        System.out.println("********************");
    }
}
