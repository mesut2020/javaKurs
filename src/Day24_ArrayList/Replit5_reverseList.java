package Day24_ArrayList;

import java.util.ArrayList;

public class Replit5_reverseList {

    public static ArrayList<String> rotateList(ArrayList<String> city){

        // Collections.reverse(city);
        ArrayList <String> newCity = new ArrayList <>();
        int p=0;

        for(int i=city.size()-1;i>=0;i--)
        {
            String str = city.get(i);

            newCity.add(str);p++;
        }

        return newCity;
    }

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        {
            city.add("Rudesheim am Rhein");
            city.add("Wiesbaden");
            city.add("Frankfurt");
            city.add("Mainz");
            city.add("Dresden");
        }

        System.out.println(rotateList(city));
    }
}
