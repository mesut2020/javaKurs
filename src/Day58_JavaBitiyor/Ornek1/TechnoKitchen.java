package Day58_JavaBitiyor.Ornek1;

public class TechnoKitchen {

    public static void pisir(IFood yemek){
        System.out.println("===="+yemek.getClass().getSimpleName()+"==== hazirlaniyor...");
        if(yemek instanceof AdanaKebap) {
            ((AdanaKebap) yemek).marinade(); // buraya gelen yemek AdanaKebap cinsinden oldugu icin yeniden olusturmadan direk ceviyoruz.
            ((AdanaKebap) yemek).grill();
        }

        if(yemek instanceof Lahmacun) {
            ((Lahmacun) yemek).dough();
            ((Lahmacun) yemek).topping();
            ((Lahmacun) yemek).addMeat();
            ((Lahmacun) yemek).bake();
        }

        if(yemek instanceof Borsh) {
            ((Borsh) yemek).boil();
            ((Borsh) yemek).eatTomorrow();
        }

        if(yemek instanceof Palov) {
            ((Palov) yemek).fry();
            ((Palov) yemek).boil();
        }

    }

}
