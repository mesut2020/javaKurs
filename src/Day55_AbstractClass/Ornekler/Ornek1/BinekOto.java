package Day55_AbstractClass.Ornekler.Ornek1;

public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public abstract String getMarka(); // implemente edilmek zorunda, yani alt class lar kullanmak zorunda

    public int getUretimYili(){  // abstract olmadigi icin alt class larda istenirse kulllanilir, itenmezse kullanilmaz.
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
