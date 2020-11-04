package Day21_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix4 {
    public static void main(String[] args) {
        // sumTotal sorusu
        // String 2D array oluştur
        // {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
        // String de $ varsa 3.2 ile çarp
        // String de € varsa 4.2 ile çarp
        // double return et...

        String [][] strMatrix= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double total=0;

        for (int i = 0; i <strMatrix.length ; i++) {
            for (int j = 0; j < strMatrix[i].length; j++) {
                if(strMatrix[i][j].contains("$"))
                {
                    total+=Integer.parseInt(strMatrix[i][j].replace("$",""))*3.2;
                }
                else
                    if(strMatrix[i][j].contains("€"))
                    {
                        total+=Integer.parseInt(strMatrix[i][j].replace("€",""))*4.2;
                    }
            }

        }

        System.out.println("TOTAL = " +total);

    }
}
