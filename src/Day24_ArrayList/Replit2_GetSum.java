package Day24_ArrayList;

import java.util.ArrayList;

public class Replit2_GetSum {

    public static int getSum(ArrayList<Integer> nums){

        int sum=0;
        for(int i=0; i<nums.size();i++)
            sum+= nums.get(i);

        return sum;
    }

    public static void main(String[] args) {
        //Arraylist teki sayilarin toplami...

        ArrayList<Integer> nums= new ArrayList<>();
        {
            nums.add(3);
            nums.add(2);
            nums.add(15);
            nums.add(25);
        }

        System.out.println(getSum(nums));

    }
}
