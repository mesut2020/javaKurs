package Day28_SET;

import java.util.*;

public class Set5 {

    public static int indexOfSet(Set<String> hs, String str2,int [] array, int a){

        int i=0;
        str2="Armut";
        hs.remove("Kiraz");
        array [1] = 5;

        a=5;

        Iterator iter = hs.iterator();

        while (iter.hasNext())
        {
            String str = (String) iter.next();
            i++;
            if (str==str2) break;
        }
        return i;
    }

    public static void main(String[] args) {

        // Method a gonderilen int, double, String, char ... main i etkilemiyor...
        // Fakat method a gonderilen, array, list ve set ler methodda degsiiklik olduysa degismis bi sekilde geri geliyor...

        Set<String> strSet = new HashSet<>(Arrays.asList("Elma","Armut","Kiraz","Muz","Cilek","Ananas"));
        //Set<String> strLinkedSet = new LinkedHashSet<>(strSet);
        //Set<String> strTree= new TreeSet<>(strLinkedSet);
        String str1 = "Elma";
        System.out.println("Set = " +strSet+"\nAradiginiz kelime = "+ str1);
        //System.out.println("LinkedHashSet = " + strLinkedSet);
        //System.out.println("TreeSet  = "+ strTree);
        int [] array = new int [3];
        array[0]= 0;
        array[1]=1;
        array[2]=2;
        System.out.println("Array = " +Arrays.toString(array));
        int a = 0;
        System.out.println("a = " + a);

        System.out.println("Aradiginizin sirasi = " + indexOfSet(strSet, str1,array,a));
        System.out.println(strSet+" "+str1);
        System.out.println("Array = " +Arrays.toString(array));
        System.out.println("a = " + a);
    }
}
