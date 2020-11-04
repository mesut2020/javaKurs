package Day56.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.setName("Pamuk");
        kedi.setVahsiMi(false);
        kedi.setDogumTarihi(LocalDate.of(2010, 1, 5));
        System.out.println(kedi);
        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();

        Kedi kedi2 = new Kedi();

        Kartal kartal = new Kartal();
        kartal.setName("Altin Basli Kartal");
        kartal.setVahsiMi(true);
        kartal.setDogumTarihi(LocalDate.of(2000, 1, 2));
        System.out.println(kartal);
        kartal.yiyecegi();
        kartal.yemekMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();

        System.out.println(kedi2);
        System.out.println(kartal);

        System.out.println(kartal.getID());

        System.out.println(Kedi.kediSayac);
        System.out.println(Kartal.kartalSayac);

    }
}
