package Day35_Project5.Laptop;

import java.util.ArrayList;

public class Calculation {

     /*
        Create method name is getRam

        Parameter is ArrayList<String>

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */


     /*
        getRam methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle


        return  price olmalı.

        Not price -- fiyat
     */
    public static int getRam(ArrayList<String> arrList){
        // int e cevirmeye gerek yok...
        int price = 0;
        int ram = Integer.parseInt(arrList.get(2).replaceAll("[ gb]",""));
        if(arrList.get(2)=="32 gb") price=300;
        else if(arrList.get(2)=="16 gb") price=200;
        else if(arrList.get(2)=="8 gb") price=100;
        else price=50;

        return price;
    }

    /*
       Create method name is getCPU

        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */


      /*
        getCPU  methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle


        return  price olmalı.
     */

    public static int getCPU(ArrayList<String> arrList){
        int price = 0;
        if(arrList.get(3).contains("i3")) price=200;
        else  if(arrList.get(3).contains("i5")) price=300;
        else price=500;

        return price;
    }

    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

     /*
        getColor methodunu oluşturalım

        Parametresi  ArrayList<String> olsun

        return türü int olmalı


        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle


        return  price olmalı.

     */
     public static int getColor(ArrayList<String> arrList){
         int price = 0;
         if(arrList.get(4)=="Red") price=400;
         else if(arrList.get(4)=="Orange") price=300;
         else if(arrList.get(4)=="Silver") price=200;
         else price=150;

         return price;
     }


    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */



    /*
        getSize  methodunu oluşturalım

        return türü int olmalı

        Parametresi  ArrayList<String> olsun


        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle


        return  price olmalı.
     */

    public static int getSize(ArrayList<String> arrList){
        int price = 0;
        if(arrList.get(1).contains("Mini")) price=100;
        else if(arrList.get(1).contains("Middle")) price=200;
        else price=300;

        return price;
    }

}
