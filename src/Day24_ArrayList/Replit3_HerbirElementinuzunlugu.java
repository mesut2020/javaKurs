package Day24_ArrayList;

import java.util.ArrayList;

public class Replit3_HerbirElementinuzunlugu {

    public static ArrayList<Integer> getLength(ArrayList<String> city)
    {
        ArrayList<Integer> length = new ArrayList<>();
        for (int i = 0; i < city.size(); i++)
        {
            length.add(city.get(i).length()); // city deki her bir indexteki elementin uzunlugunu yeni ArrayList() e atar.
        }

        return length;

    }

    public static void main(String[] args) {

        /*getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
                Tüm elementlerin uzunluğunu döndürün

                Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı*/

        ArrayList<String> city = new ArrayList<>();
        {
            city.add("Rudesheim am Rhein");
            city.add("Wiesbaden");
            city.add("Frankfurt");
            city.add("Mainz");
            city.add("Dresden");
        }

        System.out.println(getLength(city));



    }
}
