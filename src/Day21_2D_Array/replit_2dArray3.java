package Day21_2D_Array;

import java.util.Arrays;

public class replit_2dArray3 {
    public static void main(String[] args) {
        //Kodu aşağıya yazınız.

        String[][] city={{"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};


        for(int i=0; i<city.length; i++)
            for(int j=0; j<city[i].length; j++)
                if(city[i][j]=="ohio")
                    city[i][j]="Florida";

        for(int i=0; i<city.length; i++)
            System.out.println(Arrays.toString(city[i]));

        System.out.println(Arrays.toString(city));

        System.out.println("Arrays.deepToString(city) = " + Arrays.deepToString(city));


    }
}

