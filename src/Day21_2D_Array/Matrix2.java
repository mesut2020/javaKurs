package Day21_2D_Array;

public class Matrix2 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et.

        int[][] matrix= {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int max = matrix[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (max<matrix[i][j]) max=matrix[i][j];

            }

        }

        System.out.println("Max = " +max);

    }
}
