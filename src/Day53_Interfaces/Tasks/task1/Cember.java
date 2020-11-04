package Day53_Interfaces.Tasks.task1;

public class Cember implements Sekil{

    @Override
    public int cevre(int... dizi) {
        return (int) (piSayisi*dizi[0]*2);
    }

    @Override
    public int alan(int... dizi) {
        return (int)(piSayisi*dizi[0]*dizi[0]);
    }
}
