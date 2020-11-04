package Day53_Interfaces.Tasks.task1;

public class Diktortgen implements Sekil {


    @Override
    public int cevre(int... dizi) {
        if(dizi.length==1) return 4*dizi[0]; // eger tek deger geliyorsa kare degilse diktorgen
        else return 2*(dizi[0] + dizi[1]);
    }

    @Override
    public int alan(int... dizi) {
        if(dizi.length==1) return dizi[0]*dizi[0];
        else return dizi[0]*dizi[0];
    }
}
