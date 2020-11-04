package Day58_JavaBitiyor.Ornek1;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("Bizim etliekmege benziyor, yinede guzel...");
    }

    @Override
    public double ucret() {
        return 3;
    }

    void dough(){
        System.out.println("Hamur acilir...");
    }

    void addMeat(){
        System.out.println("Acilan hamurun uzerine et konur...");
    }

    void topping(){
        System.out.println("Yuvarlak hale getirilir...");
    }

    void bake(){
        System.out.println("Tas firinda pisirilir...");
    }


}
