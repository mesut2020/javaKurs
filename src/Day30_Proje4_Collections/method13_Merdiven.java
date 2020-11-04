package Day30_Proje4_Collections;

public class method13_Merdiven {
    public static int minCostClimbingStairs(int [] cost){

        int step1=cost[0];
        int step2=cost[1];
        for (int i = 2; i <cost.length ; i++) {
            int current_Step= cost[i]+Math.min(step1,step2);
            step1=step2;
            step2=current_Step;

            System.out.println("Current Step " +current_Step);
            System.out.println("step1 = " + step1);
            System.out.println("step2 = " + step2);
        }

        return Math.min(step1,step2);


      /* int[] maliyet = new int[intArr.length];
        maliyet[0]=intArr[0];
        maliyet[1]=intArr[1];

        for (int i = 2; i <intArr.length ; i++) {

            maliyet[i] =Math.min(maliyet[i-1],maliyet[i-2])+intArr[i];
        }
        int min = Math.min(maliyet[maliyet.length-2],maliyet[maliyet.length-1]);

        return min;*/

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("MiniCost = " + minCostClimbingStairs(arr));


    }
}
