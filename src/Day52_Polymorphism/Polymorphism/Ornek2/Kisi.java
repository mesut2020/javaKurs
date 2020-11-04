package Day52_Polymorphism.Polymorphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }

    public static void kimlikYaz(Kisi kisi){
        System.out.println("_________________________");
        System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Ad"," : ",kisi.ad,"|");
        System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Soyad"," : ", kisi.soyad,"|");
        System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Gorev" ," : ",kisi.gorevi,"|");

       if (kisi.gorevi.equals("Ogrenci")) {
            // Ogrenci ogr= (Ogrenci) kisi;
            // System.out.println("Sube= " +ogr.getSube() );
            System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Sube" ," : ",((Ogrenci)kisi).getSube(),"|" );
        }else {
            // Calisan cal= (Calisan) kisi;
            // System.out.println("Departman= " +cal.getDepartman());
            System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Departman" ," : ",((Calisan)kisi).getDepartman(),"|");
        }



       /* if (kisi instanceof Calisan) {
            Calisan calisan = (Calisan) kisi;
            System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Departman" ," : ", calisan.getDepartman(),"|");
            System.out.println("-------------------------");
        }

        if (kisi instanceof Ogrenci) {
            Ogrenci ogr = (Ogrenci) kisi;
            System.out.printf("%1s%10s%-3s%-10s%1s\n","|","Sube"," : ",ogr.getSube(),"|");
            System.out.println("-------------------------");
        }*/

    }

}
