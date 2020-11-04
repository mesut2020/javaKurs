package Day15_Proje1;

import java.util.Scanner;

public class countE {

    /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        String bHali = text.toLowerCase().replaceAll("[^b]","");

        int bSayi = bHali.length();

        System.out.println(bSayi);


        //        int donguSayac = 0;
        //        int bSayisi = 0;
        //
        //
        //        while(donguSayac < text.length()){
        //            if(text.charAt(donguSayac)=='b'||text.charAt(donguSayac)=='B'){
        //                bSayisi++;
        //            }
        //            donguSayac++;
        //
        //        }
        //
        //        System.out.println(bSayisi);

    }
}
