package Day40_Project6_Class_myTest.Settings;

import java.util.ArrayList;

public class Address {



     private static ArrayList<String> cityList = new ArrayList<>();

     public void SetCity(){

         cityList.add("New York");
         cityList.add("New Jersey");
         cityList.add("Ohio");
         cityList.add("Pennsylvania");
         cityList.add("Washington");
         cityList.add("Atlanta");
     }


    /*
        Üç tane  private  String variables oluştur
        Address1
        City
        ZipCode
     */
    private String Adress1;
    private String City;
    private String ZipCode;


     /*
    Address1  methodunu oluştur
    Return türü String
    Parameter  String(myAddress) olmalı

    private Address1 eşittir myAddress
     */
public String Address1(String myAddress){
    Adress1 = myAddress;

    return myAddress;
}



     /*
         City methodunu olustur
        return türü String
        parameter  String(myCity) olmalı

        if cityList  myCity  içermiyorsa
         We are not able to ship to your location  return et

        Eger ilk condition false ise
        private City  myCity ye eşittir
     */

public String City(String myCity){
    if(!cityList.contains(myCity)) return "We are not able to ship to your location";
    else City=myCity;
    return myCity;
}


    /*
       Zipcode methodunu oluşturun
       Return türü String
       Parameter  String(myZipcode) olmalı

       if myZipcode length 5 e eşit değilse
       Zip code length should be 5  return et

        Eger ilk condition false ise
        private ZipCode  myZipcode ye eşittir

    */

    public String ZipCode(String myZipcode){
        if(myZipcode.length()!=5) return "Zip code length should be 5";
        else ZipCode=myZipcode;
        return myZipcode;
    }





}
