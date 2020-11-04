package Day21_2D_Array;

import java.util.Scanner;

public class Mentoring_input2DArray {

    public static int total2dArr(int[][] m) {
        int sum=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }

        return sum;
    }

   
    public static void main(String[] args) {
        /*     int[][] m = new int[2][4];
        Ekrandan 2D Array in elementlerini alan ve bunlarin toplamini yazdiran Java programini yaziniz
        task1-->Scanner class  ile ekrandan 2D Array in degerlerini alabilen kod parcasini yaziniz.
        task2-->2D array in degerlerini toplayan method'u yaziniz.    */

            Scanner input=new Scanner(System.in);
            int[][] m = new int[2][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
            System.out.println(total2dArr(m));


            
    }





}
