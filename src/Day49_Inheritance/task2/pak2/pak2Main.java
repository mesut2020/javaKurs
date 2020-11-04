package Day49_Inheritance.task2.pak2;

import Day49_Inheritance.task2.pak1.pak1Hayvan;

public class pak2Main {
    public static void main(String[] args) {

        pak1Hayvan hayvan2 = new pak1Hayvan();
        hayvan2.ad="kopek"; // publik oldugu icin bu paketten diger paketin icindeki degsikene ulastik.
        // hayvan2.yas=8;  // default olunca sadece kendi paketinden ulasilbilir.
        // hayvan2.cins = "kangal";
        // hayvan2.renk ="gri"; // private oldugundan sadece kendi class inin icinden ulasilabilir.

        pak2Kedi kedi = new pak2Kedi("kopuk", "tekir");
        kedi.bilgiYaz();
        // kedi.cins  sadece kendi alt sinifindan ulasilabilir.


    }
}
