package Day18_Array;

public class Array1 {
    public static void main(String[] args) {
        // 1 sinifta 100 tane ogrenci var. Bunlarin final sonucunu okutunuz.
        // Ortalamayi gecen ogrenci sayisini bulunuz...

        // int[] grade = new int[100]; // hafizada 100 tane int degiskeni olusturur.
        // grade[0] // ilk degisken
        // grade[1] // ikinci degisken
//        ....
//        .....
//        .....
//        grade[99] son degisken

        // fracNumbers
        // double[] num={4.0, 5.2, 4.5, 0.3};
        // ArrayIndexOutOfBondsException => olusturalan array sinirini asarsak hata cikar...

        int   sayi;
        int[] dizi1=new int[5]; // 0,1,2,3,4 indexli  5 adet eleman

        System.out.println("dizi1.length = " + dizi1.length);

        for(int i=0; i<dizi1.length; i++)
        {
            System.out.println("Dizinin "+i+".Elemanı="+dizi1[i]);
        }

        System.out.println(dizi1[4]);


    }
}
