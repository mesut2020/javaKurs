package Day19_Array;

public class Array5_2D_Arrays {
    public static void main(String[] args) {
        // 2x3 = 2 satir 3 sutun.
        // 3 ogrencinin 2 ders notunu tanimlarken 2 boyutlu dizide veriniz.
        // her dersin not ortalamasi...

        int[] grade1= new int[5]; // 1 boyutlu dizi
        int[] grade2= {4,7,18,9,13}; // 1 boyutlu dizi ve deger atama

        int[][] matrix1 = new int[2][3]; // 2 boyutlu dizi
        int[][] matrix2 = {{65,76,90},{80,66,95}};

        for(int x=0; x<2;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print(matrix2[x][y] +" ");
            }
            System.out.println();
        }

        int gradesTotal=0;

        for(int x=0; x<2;x++)
        {
            for(int y=0;y<3;y++)
            {
                gradesTotal+=matrix2[x][y];
            }

        }

        System.out.println("Butun derslerin toplami: " + gradesTotal);

        // 1. dersin toplami
        int gradesTotal1 = 0;
        for(int y=0;y<3;y++)
        {
            gradesTotal1+=matrix2[0][y];
        }
        System.out.println("Birinci dersin toplami : " + gradesTotal1);

        // 2. dersin toplami
        int gradesTotal2 = 0;
        for(int y=0;y<3;y++)
        {
            gradesTotal2+=matrix2[1][y];
        }
        System.out.println("Ikinci dersin toplami : " + gradesTotal2);

        System.out.println("Birinci Dersin ortalamasi = " + gradesTotal1/3);
        System.out.println("Ikinci Dersin ortalamasi = " + gradesTotal2/3);


    }
}
