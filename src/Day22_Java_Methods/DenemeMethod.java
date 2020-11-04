package Day22_Java_Methods;

public class DenemeMethod {

    public static void toplama1(int a, int b){
        int toplam=a+b;
        System.out.println(toplam);
    }


    public static int toplama2(int a, int b){
        int toplam=a+b;
        System.out.println(toplam);
        return toplam;
    }

    public static void main(String[] args) {
        toplama1(10, 20);

        int x=toplama2(10, 20);
        System.out.println(x*100/2);

    }
}
