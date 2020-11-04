package Day28_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>(); // Sadece int alabilen bir Set tanimlandi
        //Set<Integer> hs = new HashSet<>(); // (ucude ayni ama bu onerilen)Sadece int alabilen SET...
        Set hsObject = new HashSet(); // Bu tanimlamada her turlu degsiken girilebilir...
        // butun tipleri kapsayan tipin adi : Object -> Nesen -> Hersyein atasi...
        // Bu tanimlama digerlerine gore yavas calsiir.
        // Tutarsiz olabilir veriler, biraz kontrol disi oluyor...
        // Zorunlu degilse kullanilmasi onerilmez.

        HashSet<Integer> hs = new HashSet<>(); // onerilen tanimlama...
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(5);

        System.out.println("hs = "+hs); //hs = [1, 34, 3, 5, 7]
        // Hizli calismak icin belli bir (hash) algorithmaya gore siraliyor...

        //2. yontem yazdirma: elemanlara tek tek ulasma (foreach)
        for (Integer eleman:hs) {
            System.out.println("hs =" +eleman);
        }

        // 3. yontem: The Iterator Interface
        Iterator it = hs.iterator(); // hs nin basina konumlan...

        while (it.hasNext()) {  // iteratorun konumlandigi yere gore sonrasinda elemen varsa TRUE uretir...
            Integer eleman = (Integer) it.next(); // gostergenin gosterdigi veri tipi OBJECT
            System.out.println("it : eleman = " + eleman);

            if (eleman == 34)
                it.remove(); // daha hizli siler...

        }
        System.out.println("it remove sonrasi : " +hs);

        hs.remove(5);

        if (hs.contains(5)) System.out.println("5 var = " + hs);
        else System.out.println("5 yok = " + hs);

        hs.clear();

        System.out.println("Clear sonrasi hs = " +hs);

    }
}
