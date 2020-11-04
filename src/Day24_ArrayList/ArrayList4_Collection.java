package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4_Collection {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(69);
        num.add(3);
        num.add(1);
        num.add(2);

        System.out.println("Sirali degil = "+num);

        Collections.sort(num);
        System.out.println("Sirali = "+ num);

        int max = Collections.max(num);
        int min = Collections.min(num);

        Collections.reverse(num);
        System.out.println("Tersden yaz =" +num);

        Collections.fill(num, 101); // butun elemenalara bir deger atama...
        System.out.println("fill den sonra = " + num);

        // belli bir degere sahip elemanlari yenisi ile degistirir...
        Collections.replaceAll(num, 101, 5);
        System.out.println("replaceAll dan sonra = " + num);



    }
}
