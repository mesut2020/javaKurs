package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Replit1_AyniElementiBul {

    public static int getCount(ArrayList<String> fruits, String str)
    {
        int x= Collections.frequency(fruits,str);
        return x;

    }

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");

        String str = "Apple";

        int a= getCount(fruits, str);

        System.out.println(a);


    }
}
