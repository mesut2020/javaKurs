package Day24_ArrayList;

import java.util.ArrayList;


public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>(){
            {
                add("Almanca");
                add("Ingilizce");
                add("Turkce");
                add("Rusca");
            }
        };
        System.out.println("List1 = " +list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rusca");
        list2.add("Turkce");
        list2.add("Arapca");

        System.out.println("List2 = " +list2);

        list1.removeAll(list2); //liste1 deki liste 2 yi siler

        boolean a = list1.contains("tukce");

        System.out.println("list1 = " +list1);
        System.out.println("List2 = " +list2);


    }
}
