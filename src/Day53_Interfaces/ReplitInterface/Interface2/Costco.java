package Day53_Interfaces.ReplitInterface.Interface2;

import java.util.ArrayList;

public class Costco implements deliveryOptions {
//    Costco  class'ının içinde
//    getTotal'ı ve deliveryOptions interface'indeki isFreeShipping methodunu override edin.
//
//    getTotal methodunun içinde bunun gibi Stringler vardır. $3K , $200 , $1K
//
//    Stirng'leri int yapın ve toplam sayıya return edin.
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

    //    isFreeShipping  methodunun içinde;
//    Eğer toplam sayı CostcoMinFreeDelivery'dan yüksekse "Print you are eligible for free delivery" yazdırınız.
//    Eğer toplam sayı CostcoMinFreeDelivery 'dan düşükse "print you need to buy ..... amount of item." yazdırınız.

    @Override
    public String isFreeShipping(ArrayList<String> arrList2) {
        if(getTheTotal(arrList2) > CostcoMinFreeDelivery) return "you are eligible for free delivery";
        else return "you need to buy "+ (CostcoMinFreeDelivery-getTheTotal(arrList2)) +" amount of item.";
    }

}
