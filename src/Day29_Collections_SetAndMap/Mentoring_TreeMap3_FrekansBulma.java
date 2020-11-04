package Day29_Collections_SetAndMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mentoring_TreeMap3_FrekansBulma {

    //TODO  TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını bulma
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence...");
        String sentence=scan.nextLine();

        Map<Character,Integer> frekans=new TreeMap<>();

        for (int i = 0; i <sentence.length() ; i++) {

            char c=sentence.charAt(i);

            if(frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            }else {
                frekans.put(c, 1);
            }

        }

        for (Map.Entry<Character,Integer>entry: frekans.entrySet()) {
            System.out.println("Karakter "+entry.getKey()+" "+entry.getValue()+" kadar var...");
        }


    }
}
