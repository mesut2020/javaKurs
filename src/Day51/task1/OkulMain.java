package Day51.task1;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("TechnoStudy", 100);

        Ogrenci ogr1 = new Ogrenci("Deniz", "Umraniye", okul,UyeTipi.OGRENCI,5000);
        Ogrenci ogr2 = new Ogrenci("Davut", "Bagcilar", okul, UyeTipi.OGRENCI,6000);

        Calisan cal1 = new Calisan("Hulya", "Kartal", okul, UyeTipi.CALISAN,7000);
        Calisan cal2 = new Calisan("Mustafa", "Kadikoy", okul, UyeTipi.CALISAN,8000);

        okul.ogrenciKayit(ogr1);
        okul.ogrenciKayit(ogr2);

        okul.calisanKayit(cal1);
        okul.calisanKayit(cal2);

        System.out.println(okul);
    }
}
