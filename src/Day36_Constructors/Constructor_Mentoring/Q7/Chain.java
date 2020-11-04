package Day36_Constructors.Constructor_Mentoring.Q7;
class Chain
{
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
        System.out.print(x*y);      // 1. 50 yazar   2. 5 yazar    3." the default constructor" yazar
    }

    public static void main(String[] args) {

        Chain x=new Chain();                   // Output : 505 the default constructor
    }
}


