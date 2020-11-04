package Day51.task1;

public class Kisi {

    private String isim;
    private String adres;
    private Okul okul;
    private UyeTipi uyeTipi;

    public Kisi(String isim, String adres, Okul okul, UyeTipi uyeTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUyeTipi(uyeTipi);
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }
    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }
    public void setUyeTipi(UyeTipi uyeTipi) {
        this.uyeTipi = uyeTipi;
    }

    @Override
    public String toString() {
        return "\nisim=" + isim +
                ", adres=" + adres +
                ", okul=" + okul.getIsim() +
                ", uyeTipi=" + uyeTipi
                ;
    }
}
