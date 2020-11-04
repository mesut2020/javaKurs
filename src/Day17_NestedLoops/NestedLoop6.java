package Day17_NestedLoops;

public class NestedLoop6 {

    public static void main(String[] args) {

        //    *
        //  * *
        //* * *

        for(int i=5;i>=1;i--)
        {
            for(int x=i-1; x>0; x--)
            {
                System.out.print(" ");
            }
            for (int j=5; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
