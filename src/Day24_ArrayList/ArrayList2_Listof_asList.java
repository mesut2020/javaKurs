package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2_Listof_asList {

    public static void main(String[] args) {

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list3 = " + list3);

        list3.addAll(Arrays.asList(4,5,6,7,8));
        System.out.println("list3 = " + list3);

        System.out.println();

        ArrayList<Integer> list4 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("list4 = " + list4);

        list4.addAll(List.of(1,2,3,4,5));
        System.out.println("list4 = " + list4);

        int a=55;
        char b= 'c';
        String str = "Elma";
        int[] arr = {1,2,3};
        String[] strArr = {"Elma","Armut","Portakal"};

        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(a);
        intList.add(0,3);
        System.out.println("intList add int = " + intList);

        strList.add(str);

        strList.addAll(Arrays.asList(strArr));
        System.out.println("strList = " + strList);
        strList.addAll(List.of(strArr));
        System.out.println("strList = " + strList);

        strList.remove(str); // sadece bir elma cikarir...
        strList.removeAll(List.of(str)); // butun elmalari ciakrir...
        System.out.println("strList = " + strList);


    }
}
