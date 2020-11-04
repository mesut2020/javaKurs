package Day53_Interfaces.ReplitInterface.Interface2;

import java.util.ArrayList;

public class Amazon implements deliveryOptions{

//    Amazon class'ının içinde
//    getTotal method'unun içinde 3 tane bunun gibi Stirng vardır.  $3K , $200 , $1K
//
//    String'leri int yapınız ve toplam sayıya return ediniz.
//    not: sonunda K olan sayılar 1000 ile çarpılır.
//


    @Override
    public int getTheTotal(ArrayList<String> arrList1) {

        int total=0;

        for (String str: arrList1) {

            if (str.charAt(str.length() - 1) == 'K') total += 1000 * Integer.parseInt(str.replaceAll("[^0-9]", ""));
            else total += Integer.parseInt(str.replaceAll("[^0-9]", ""));
        }
        return total;
    }

    //    isFreeShipping  methodunun içinde
//    Eğer toplam sayı AmazonMinFreeDelivery'den yüksekse "you are eligible for free delivery" yadırınız.
//
//    Eğer toplam sayı AmazonMinFreeDelivery'den düşük ise "you need to buy ..... amount of item." yazdrınız.

    @Override
    public String isFreeShipping(ArrayList<String> arrList2) {

        if (getTheTotal(arrList2)>AmazonMinFreeDelivery) return"you are eligible for free delivery";

        else return "you need to buy "+ (AmazonMinFreeDelivery-getTheTotal(arrList2)) +" amount of item.";
    }


}
