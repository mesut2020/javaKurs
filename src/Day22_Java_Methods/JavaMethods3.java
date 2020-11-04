package Day22_Java_Methods;

public class JavaMethods3 {
    public static void oddEven(int num)
    {
        if(num%2==0)
        System.out.println("Even");
        else System.out.println(("Odd"));
    }

    public static  void addition(int a, int b){
        System.out.println("Total = " +(a+b));
    }


    public static void main(String[] args) {

        oddEven(3);
        oddEven(4);

        addition(3,5);
        addition(-32,45);

    }
}
