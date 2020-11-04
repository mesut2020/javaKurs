package Day17_NestedLoops;

public class NestedLoop1 {
    public static void main(String[] args) {
        //1 dan 5 e kadar olan sayilarin asagidaki gibi yazdirin
        // 1+1=2
        // 1+2=
        // 1+3
        // 1+4
        // 1+5
        // 2+1
        //...

        for(int i=1;i<=5;i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.println(i + " + " + j +" = " +(i+j));
            }
            System.out.println();
        }
    }
}
