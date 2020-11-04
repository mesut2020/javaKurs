package Day22_Java_Methods;

import java.util.ArrayList;

public class replit_Method5 {
    public static int getSum(ArrayList<String> arrList){
        //String[] newList=ArrayList.split(",");
        int sum=0;
        for(String s: arrList) {

            sum += Integer.parseInt(s.replace("$", ""));
        }
            if(sum<0)return -1;
        else return sum;
    }

    public static void main(String [] args){
        /* getSum isminde bir method oluşturun.
                Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
                sonuç 0'dan küçükse, -1 yazdırın.

        Örnek1: ArrayList = $13, $15, $20
        Cevap = 48 olmalı

        Örnek 2 :  ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.  */

        //Scanner sc= new Scanner(System.in);
        //String ArrayList =sc.nextLine();

        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("$13");
        strArrList.add("$15");
        strArrList.add("$-20");
        System.out.println(strArrList);
        int sum = getSum(strArrList);
        System.out.println(sum);


    }

}
