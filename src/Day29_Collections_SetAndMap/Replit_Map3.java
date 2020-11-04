package Day29_Collections_SetAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Replit_Map3 {
    public static ArrayList<String> returnValue(Map<Integer,String> hm){

        ArrayList <String> arrList = new ArrayList<>();

        for(String vl: hm.values())
        {
            arrList.add(vl);
        }
        return arrList;

    }

    public static void main (String[] args){

        Map<Integer, String> hm = new HashMap<>();
        hm.put(1,"Lion");
        hm.put(2,"Tiger");
        hm.put(3,"Elephant");
        hm.put(4,"Cat");
        hm.put(5,"Dog");

        System.out.println(returnValue(hm));

    }

}
