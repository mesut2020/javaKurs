package Day29_Collections_SetAndMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mentoring_TreeMap4_frekansMethod {
    // TreeMap_3 ornegini method kullanarak yapin.parametre String olsun

    public static void frekansBul(String text){
        Map<Character,Integer> frekans=new LinkedHashMap<>();

        //merhaba
        char c=' ';System.out.println(frekans);
        for (int i = 0; i <text.length() ; i++) {
            c=text.charAt(i);
            if(frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1); //frekans.put(c, frekans.get(c) + 1);
            }else {
                frekans.put(c, 1);
            }System.out.println("frekans.get(c)+1 = " + frekans.get(c));
        }

        for (Map.Entry<Character,Integer>entry: frekans.entrySet()) {
            System.out.println("Karakter "+entry.getKey()+" "+entry.getValue()+" kadar var...");
        }
        System.out.println(frekans);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String sentence=scan.nextLine();
        frekansBul(sentence);
    }

}
