package Day24_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
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

        list1.addAll(list2); // parantez icindeki listeyi liste1 e ekler...
        System.out.println("list1 = " +list1);

        list1.addAll(2,list2); // list2 yi, list1 in 2. indexinden baslayarak araya ekler. uzerine yazmaz...
        System.out.println("liste1 = " + list1);

        if(list1.contains("Turkce"))
            System.out.println("Turkce dili var");


    }
}
