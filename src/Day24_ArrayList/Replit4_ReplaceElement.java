package Day24_ArrayList;

import java.util.ArrayList;

public class Replit4_ReplaceElement {
   public static ArrayList<String> changelnArrayList(ArrayList<String> colors, String str1, String str2){

       for (int i = 0; i < colors.size(); i++)
       {
       if(colors.get(i).equalsIgnoreCase(str1)) colors.set(i,str2);
       }

       return colors;
   }

    public static void main(String[] args) {

       ArrayList<String> colors = new ArrayList<>();
        {
            colors.add("Yellow");
            colors.add("Green");
            colors.add("Red");
            colors.add("Yellow");
        }

        String str1 ="Yellow";
        String str2 = "White";

        System.out.println(changelnArrayList(colors,str1,str2));

    }
}
