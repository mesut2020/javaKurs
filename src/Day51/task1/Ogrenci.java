package Day51.task1;

public class Ogrenci extends Kisi {
    private double okulUcreti;

    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, double okulUcreti) {
        super(isim, adres, okul, uyeTipi);
        setOkulUcreti(okulUcreti);
    }

    public double getOkulUcreti() {
        return okulUcreti;
    }

    public void setOkulUcreti(double okulUcreti) {
        this.okulUcreti = okulUcreti;
    }

    @Override
    public String toString() {
        return super.toString()+" Okul ucreti: "+getOkulUcreti();
    }
}
