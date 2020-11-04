package Day21_2D_Array;

public class Matrix1 {
    public static void main(String[] args) {
        int num=0;
        int[] arr=new int[5];
        int[][] mat=new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j]= (int)(Math.random()*89)+10; //10 ile 99 arasinda rastgele sayi uretir...
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
