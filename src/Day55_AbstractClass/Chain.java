package Day55_AbstractClass;

public class Chain {
    Chain()
    {
        this(5);
        System.out.print(" the default constructor");
    }
    Chain(int x){
        this(5,10);
        System.out.print(x);
    }

    Chain(int x, int y){
        System.out.print(x*y);
    }
    public static void main(String[] args) {
        Chain x=new Chain(5);
    }
}
