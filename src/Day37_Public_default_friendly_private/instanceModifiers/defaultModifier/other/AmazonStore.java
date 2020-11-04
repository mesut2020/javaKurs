package Day37_Public_default_friendly_private.instanceModifiers.defaultModifier.other;

import Day37_Public_default_friendly_private.instanceModifiers.defaultModifier.same.Book;

public class AmazonStore {
    public static void main(String[] args) {
        // Book kitap1 = new Book(); // default oldugundan ulasilamaz...

        Book kitap2 = new Book("beyaz");// bu constructor a ulastim cunku public
    }
}
