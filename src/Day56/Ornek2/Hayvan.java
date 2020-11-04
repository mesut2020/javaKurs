package Day56.Ornek2;

import java.time.LocalDate;

public abstract class Hayvan {

    private static int sayac=1;
    private String isim;
    private boolean vahsiMi;
    private LocalDate dogumTarihi;
    private int id;


    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    Hayvan(){
        id=sayac++;
    }
    public int getID(){
        return id;
    }
//    public int getSayac(){
//        return sayac++;
//    }

    public String getName() {
        return isim;
    }

    public void setName(String name) {
        this.isim = name;
    }

    public boolean isVahsiMi() {
        return vahsiMi;
    }

    public void setVahsiMi(boolean vahsiMi) {
        this.vahsiMi = vahsiMi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id + "\n" +
                "name=" + isim + "\n" +
                "vahsiMi=" + vahsiMi +"\n"+
                "dogumTarihi=" + dogumTarihi +"\n"+
                '}';
    }
}
