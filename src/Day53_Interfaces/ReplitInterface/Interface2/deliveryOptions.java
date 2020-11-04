package Day53_Interfaces.ReplitInterface.Interface2;

import java.util.ArrayList;

public interface deliveryOptions {
//    deliveryOptions  class interface'i (arayüz) yap.
//
//    3 tane method oluşturun.
//    birinci methodun ismi getTheTotal parametresi String arraylist, return type'ı int.
//    ikinci methodun ismi isFreeShipping  parametresi String arraylist, return type'ı String.
//
//    iki tane int oluşturun.
//    ilki AmazonMinFreeDelivery = 10000
//    ikincisi CostcoMinFreeDelivery =  15000

    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery =  15000;

     int getTheTotal(ArrayList<String> arrList1);
     String isFreeShipping(ArrayList<String> arrList2);

}
