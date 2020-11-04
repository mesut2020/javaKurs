package Day30_Proje4_Collections;

import java.util.HashSet;

public class TotalLength {

    /*
       Parameter is one Set String
       Get the total length of each String in the Set
       return the total
       Example:
       Set String is "repl" "is" "homework"
       result should be 14
       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1
     */

    /*
       Parametresi  Set String olan ve Set içindeki Stringlerin uzunluklarının
       toplamını döndüren getTotalLength methodunu yazın.
       retur total

       Örnek:
       Set String "repl" "is" "homework"
       result  14 olmalı
       NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİR
     */

    public int getTotalLength(HashSet<String> mySet){
        int total=0;

        for (String str: mySet) {
            total+=str.length();
        }
        if(total==0) total=-1;


        return total;

    }

}

