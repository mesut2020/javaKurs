package Day55_AbstractClass.Ornekler.Ornek2;

public class Cember extends Sekil {
    private double r;

    public Cember(double r){
        this.r=r;
        ciz();
    }

    @Override
    public double alan() {
        return Math.PI*r*r;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*r;
    }
}
