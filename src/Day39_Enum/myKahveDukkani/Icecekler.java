package Day39_Enum.myKahveDukkani;

public enum Icecekler {
    TURKKAHVESİ(3),
    ESPRESSO(4.5),
    GAZOZ(2.25),
    LİMONATA(2);

    private double fiyat;
    Icecekler (double fiyat){
        this.fiyat = fiyat;
    }

    public double getFiyat(){
        return this.fiyat;
    }

}
