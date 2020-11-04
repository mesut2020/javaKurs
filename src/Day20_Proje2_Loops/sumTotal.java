package Day20_Proje2_Loops;

import java.util.Scanner;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D bir dizi oluştur
        tek boyutlu bir diziyi

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de 4.2 ile ç€ varsa 4arp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın


        /*String[] useThisArray ={"$12" , "$22" , "$0","€9" , "€40" , "$1" , "$2", "€12"};

        double sum =0;
        for(int i=0; i<useThisArray.length; i++){

            if (useThisArray[i].contains("$")){
                sum+=Double.parseDouble(useThisArray[i].replaceAll("\\$",""))*3.2;
            }else if(useThisArray[i].contains("€")){
                sum+=Double.parseDouble(useThisArray[i].replaceAll("€",""))*4.2;
            }


        }
        System.out.println(sum);*/
        String[][] mat={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        int toplam=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (mat[i][j].contains("$"))  // $ içeriyorsa
                {
                    toplam +=Integer.parseInt(  mat[i][j].replace("$","")  ) * 3.2;
                }
                else
                if (mat[i][j].contains("€"))  // € içeriyorsa
                {
                    toplam +=Integer.parseInt(  mat[i][j].replace("€","")  ) * 4.2;
                }
            }
        }

        System.out.println("toplam = " + toplam);

    }
}



