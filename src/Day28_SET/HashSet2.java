package Day28_SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        // removeAll, retainAll, addAll
        Set<Integer> hs1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> hs2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        // retainAll : kesisim

        Set<Integer> hsKesisim = new HashSet<>(hs1);

        hsKesisim.retainAll(hs2); // kesisim bulundu

        System.out.println("hsKesisim = " + hsKesisim);
        
        Set<Integer> hsFark = new HashSet<>();
        
        hsFark.addAll(hs1); // Kopyalamanin ikinci yontemi
        hsFark.removeAll(hs2);

        System.out.println("hsFark = " + hsFark);

    }
}
