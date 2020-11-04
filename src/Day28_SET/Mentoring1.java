package Day28_SET;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mentoring1 {

    public static Set<Double> setOlustur(Set<Double> dSet){
        dSet.add(3.23);
        dSet.add(3.10);
        dSet.add(5.12);
        dSet.add(10.12);
        dSet.add(23.12);

        return dSet;
    }
    public static double toplaminiAl(Set<Double> dset){
        double total=0;
        for (Double d: dset) {
            total+=d;
        }

        return total;
    }
    public static void main(String[] args) {
        /*  main method altinda bir double hashSet olusturunuz.

        ve bu seti, adi setOlustur ve return tipi hashSet double olan
        ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

        adini toplaminiAl koyacagimiz ve parametre olarak bir String hashSet kabul edecek ayri bir method olusturarak
        hashSetin degerlerinin toplamini alacaksiniz. */

        Set<Double> dSet= new HashSet<>();
        setOlustur(dSet);
        System.out.println("dSet = " + dSet);

        System.out.println("Toplam = " +toplaminiAl(dSet));





    }
}
