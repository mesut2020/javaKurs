package Day37_Public_default_friendly_private.instanceModifiers.defaultModifier.same;

public class BookStore {

    public static void main(String[] args) {
        // ayni paketin icinde oldugundan
        // default a ulasabildik
        Book kitap1 = new Book();
        kitap1.name = "Lord of the Rings";

        // zaten public oldugundan sinir yoktu
        Book kitap2 = new Book("kar");
    }
}
