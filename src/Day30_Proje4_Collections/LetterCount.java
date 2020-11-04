package Day30_Proje4_Collections;

import java.util.*;

public class LetterCount {
    /*
            Given one String
            Get an each char from String return the count of the each char
            For Example
            String = aabbbcccc
            return should be a , 2
                             b , 3
                             c , 4
            Note: There could be any char in the String.
     */

    /*

            Girdiğiniz String parametresinin herbir karakterinin(char) sayısını
            döndüren charCount methodunu yazın
            Örnek:
            String = aabbbcccc
            return     a , 2     olmalı
                       b , 3
                       c , 4
            Not: Stringde herhangi bir char olabilir.


    public static void main(String[] args){
        String myStr="abcabcabc";
        charCount(myStr);
    }
*/
    public  LinkedHashMap<Character, Integer> charCount(String myStr){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
        ArrayList <Character> strArrList = new ArrayList<>();

        for (int i=0; i<myStr.length();i++) {
            strArrList.add(myStr.charAt(i));
        }
        Collections.sort(strArrList);

        System.out.println(myStr);
        int counter=0;
        int i=0;

        for (; i < myStr.length(); i++) {

            counter=0;
            for (int j = 0; j < myStr.length(); j++)
            if(myStr.charAt(i) == myStr.charAt(j) )  counter++;
            result.put(myStr.charAt(i),counter); i+=counter-1;
        }

        System.out.println(result);
        return  result;
    }


}









