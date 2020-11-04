package Day29_Collections_SetAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class replit_Map2 {

    public static ArrayList<Integer> returnKey(Map<Integer,String> hm){

        ArrayList <Integer> arrList = new ArrayList<>();

        for(Integer ky: hm.keySet())
        {
            arrList.add(ky);
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

        System.out.println(returnKey(hm));

    }

}
