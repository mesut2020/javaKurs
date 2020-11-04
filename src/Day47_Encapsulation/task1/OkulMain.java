package Day47_Encapsulation.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul("Kabatas Lisesi", 3);
        ArrayList<Ogrenci> okulunOgrencileri = okul.getOgrenciler();
        Scanner sc = new Scanner(System.in);

        int ogrenciSayisi =1;
        int yas =0;
        do {
            System.out.print(ogrenciSayisi +".ad : ");
            String ad = sc.nextLine();

            System.out.print(ogrenciSayisi+".soyad : ");
            String soyad = sc.nextLine();
            try { // tam calsimiyor!!!
                System.out.print(ogrenciSayisi + ".yas : ");
                Scanner sc2 = new Scanner(System.in);
                yas = sc2.nextInt();
                ogrenciSayisi++;
            }
            catch (Exception e){
                System.out.println("yasini rakam olarak giriniz");
            }

            try {
                Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);
                //okul.getOgrenciler().add(ogrenci);
                okulunOgrencileri.add(ogrenci);
                //ogrenciSayisi++;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Yeni ogrenci giriniz...");
                ogrenciSayisi--;
            }

        }while(ogrenciSayisi<=okul.getMaxOgrenciSayisi());

        for (Ogrenci ogrenci : okulunOgrencileri) {
            System.out.println(ogrenci);
            System.out.println();
        }
    }
}
