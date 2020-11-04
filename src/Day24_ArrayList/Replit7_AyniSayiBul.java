package Day24_ArrayList;

import java.util.ArrayList;

public class Replit7_AyniSayiBul {

    public static ArrayList<Integer> common_values(ArrayList<Integer> arrList1, ArrayList<Integer> arrList2)
    {
        ArrayList<Integer> commonList = new ArrayList<>();

        for (int i=0; i<arrList1.size(); i++)
            for(int j=0; j<arrList2.size(); j++)
                if (arrList1.get(i)==arrList2.get(j) ) commonList.add(arrList1.get(i));

        return commonList;

    }

    public static void main(String[] args) {

        ArrayList<Integer> arrList1 = new ArrayList<>();
        {
            arrList1.add(2);
            arrList1.add(3);
            arrList1.add(7);
        }

        ArrayList<Integer> arrList2 = new ArrayList<>();
        {
            arrList2.add(1);
            arrList2.add(3);
            arrList2.add(7);
            arrList2.add(5);
        }

        System.out.println(common_values(arrList1, arrList2));
    }
}
