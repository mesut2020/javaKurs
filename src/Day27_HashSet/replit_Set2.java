package Day27_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class replit_Set2 {

    public static HashSet<String> changeSet(HashSet<String> set, String str1, String str2){
       if (set.contains(str1)) { // if (!add.contains(str1)) de yazilabilir. ayni ise eklemeyecegi icin false uretir...
           set.remove(str1);
           set.add(str2);
       }
       return set;
    }
    public static HashSet<String> changeSet2(HashSet<String> asd, String a, String b) {

        Iterator gosterge = asd.iterator();
        while (gosterge.hasNext()) {

            if (a.equals(gosterge.next()))
            {asd.remove(a); asd.add(b);break;}
        }
        return asd;

    }

    public static void main(String[] args) {

        /*
        ÖRNEK:
hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
String 1 = banana
String 2 = peach
CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
         */

        HashSet<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("kiwi");
        fruits.add("pineapple");

        String fr1="banana";
        String fr2= "peach";

        System.out.println("New HashSet 1 = " +changeSet(fruits,fr1,fr2));
        System.out.println("New HashSet 2 = " +changeSet2(fruits,fr1,fr2));

    }
}
