package Day39_Enum.myKahveDukkani;

public enum Tatlilar {


    CİLEKLİPASTA(4),
    MOZAİKPASTA(3.5),
    MUZLUPASTA(4.5);

    private double tatliFiyati;

    Tatlilar (double tatliFiyati){
        this.tatliFiyati = tatliFiyati;
    }

    public double getFiyat(){

        return this.tatliFiyati;
    }



}
