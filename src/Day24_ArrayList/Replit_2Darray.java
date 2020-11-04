package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replit_2Darray {
    public static void main(String[] args) {
        int[][] arr2d={{1,2,3},{4,5,6},{7,8,9},{1,2,3}};

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i=0; i<arr2d.length;i++)
            for(int j=0;j<arr2d[i].length;j++)
                arrList.add(arr2d[i][j]);
        System.out.println(arrList);

    }

}
