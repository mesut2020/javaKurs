package Day55_AbstractClass.Ornekler.Ornek2;

public class Dikdortgen extends Sekil {

    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik){
        this.genislik=genislik;
        this.uzunluk= genislik;
        ciz();
    }

    @Override
    public double alan() {
        return this.uzunluk*this.genislik;
    }

    @Override
    public double cevre() {
        return (this.uzunluk+this.genislik)*2;
    }
}
