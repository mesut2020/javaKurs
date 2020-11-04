package Day39_Enum.JavaEnum.Ex3;
// 1- Bir kitap sinif yaziniz. fields : name ve kategori
// 2- KitapKategori adinda ENUM olsuturun : Klasik, Roman, Fantazi, Tarih
// 3- 2 Kitap tanimlayin bir ArrayList e atiniz
// 4- bir kategoriye listeleyin

import java.util.ArrayList;

public class Ex3Main {

    public static void main(String[] args) {

        Kitap kit1 = new Kitap();
        kit1.name = "Sefiller";
        kit1.kategori = KitapKategori.KLASIK;

        Kitap kit2 = new Kitap();
        kit2.name = "Beyaz Zambaklar";
        kit2.kategori = KitapKategori.ROMAN;


        ArrayList<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);

        System.out.printf("%-5s%-20s%-10s\n","NO","KITAP ADI","KATEGORISI");
        System.out.printf("%-5s%-20s%-10s\n","--","---------","----------");
        int i=1;
        for (Kitap k : kitaplar) {
            if(k.kategori == KitapKategori.ROMAN ) System.out.printf("%02d%-3s%-20s%-10s\n",i++," ",k.name,k.kategori);
        }
    }
}
