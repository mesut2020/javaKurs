package Day17_NestedLoops;

public class HW_1_Loop {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********   //11
        //  *********    // 9
        //   *******     // 7
        //    *****      // 5
        //     ***       // 3
        //      *        // 1



        for(int i=0; i<6; i++)
        {
            for(int sp=0;sp<i;sp++)
            {
                System.out.print(" ");
            }

            for (int j=2*i; j<11; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
