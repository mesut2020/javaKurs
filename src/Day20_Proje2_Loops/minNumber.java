package Day20_Proje2_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */
     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur




        2D arrayinden min number print et

     */
    public static void main(String[] args) {
        int[][] mat =  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min=mat[0][0];

        for (int i =0; i<mat.length; i++){
            for (int j =0; j<mat[i].length; j++){
                if (mat[i][j]<min){
                    min=mat[i][j];
                }
            }
        }System.out.println("max = " + min);


}

}
