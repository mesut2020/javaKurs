package Day17_NestedLoops;

public class NestedLoop3 {
    public static void main(String[] args) {

        // 1 den 10 a kadar carpim tablosu yapiniz...

        for(int i=1;i<=10;i++)
        {
            for (int j=1; j<=10; j++)
            {
                System.out.println(i + " x " + j +" = " +(i*j));
            }
            System.out.println();
        }
    }
}
