package Day21_2D_Array;

public class Matrix7_GununSorusu {
    public static void main(String[] args) {
        // Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
        // çarpımını ekrana yan yana
        // yani 1.matris x 2.matris = sonuç matrisi şeklinde eyazdırınız...

        int[][] arr2d1= new int[3][3];
        int[][] arr2d2= new int[3][3];
        int[][] resultMatrix= new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
            {
                arr2d1[i][j]=(int)(Math.random()*10);
                arr2d2[i][j]=(int)(Math.random()*10);
               // resultMatrix[i][j]=arr2d1[i][j] * arr2d2[i][j]; // Birebir matrix leri carpmak...
            }


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    resultMatrix[i][j]+=arr2d1[i][k] * arr2d2[k][j]; // Matrix1 in satiri ile Matrix2 nin sutununu carpar.


        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.print(arr2d1[i][j] + " ");

            if(i==1) System.out.print(" X  ");
            else System.out.print("    ");

            for (int j = 0; j < 3; j++)
                System.out.print(arr2d2[i][j] + " ");

            if(i==1) System.out.print(" =  ");
            else System.out.print("    ");

            for (int j = 0; j < 3; j++)
                System.out.print(resultMatrix[i][j] + "\t");

            System.out.println();

        }

    }
}
