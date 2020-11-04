package Day37_Public_default_friendly_private.instanceModifiers.defaultModifier.same;

public class Book {

    String name;

    Book(){ // default access modifier

    }

    public Book(String name){  // public
        this.name = name;
    }

}
