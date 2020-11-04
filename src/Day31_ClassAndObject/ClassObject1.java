package Day31_ClassAndObject;
// 1. Yontem
// Araba sinifi
class Araba{
    String model;
    int yili;
    double motorHacmi;
}

public class ClassObject1 {

    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.model = "toyota camry";
        araba1.motorHacmi=1600;
        araba1.yili=2020;

        System.out.println("araba1.yili = " + araba1.yili);
        System.out.println("araba1.motorHacmi = " + araba1.motorHacmi);
        System.out.println("araba1.model = " + araba1.model);

    }
}

