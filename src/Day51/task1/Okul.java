package Day51.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {

    private String isim;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    private ArrayList<Calisan> calisanlar = new ArrayList<>();

    public Okul(String isim, int maxOgrenciSayisi) {
        setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public void calisanKayit(Calisan cal){
        calisanlar.add(cal);
    }

    public void ogrenciKayit(Ogrenci ogr){
        ogrenciler.add(ogr);
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }
    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenci() {
        return ogrenciler;
    }
    public void setOgrenci(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }
    public void setCalisanlar(ArrayList<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                ", calisanlar=" + calisanlar +
                '}';
    }
}
