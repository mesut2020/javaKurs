package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CiftSayilariBul {

    public static int AhmetT(ArrayList<Integer> list) {
        int count=0;
        int e1=Integer.MIN_VALUE, e2=list.get(0), eleman = Integer.MIN_VALUE;
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            e2 = list.get(i);
            if (e1 == e2 && e2 != eleman){
                count++;
                e1 = e2;
                eleman = e2;
            }else{
                e1 = e2;
            }
        }
        return count;
    }

    public static int duplicate(ArrayList<Integer> list){
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int c=0;
        int counter=0;

        for (int i = 0; i < list.size() ; i++) {
            c=0;
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(i)==list.get(j)) c++;
            }
            //System.out.println(list.get(i) +" --> " + c + " adet");
            if (c>1) counter++; i+=c-1;
        }
        return counter;
    }

    public static void kacarAdet(ArrayList<Integer> list){
        int c=0;
        int counter=0;

        for (int i = 0; i < list.size() ; i++) {
            c=0;
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(i)==list.get(j)) c++;
            }
            System.out.println(list.get(i) +" --> " + c + " adet");
            if (c>1) counter++; i+=c-1;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*10));
        }

        System.out.println(duplicate(list) +" adet sayi birden fazla kullanilmistir...");

        System.out.println(AhmetT(list));

        kacarAdet(list);

    }
}
