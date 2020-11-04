package Day37_Public_default_friendly_private.instanceModifiers.publicModifier.same;

public class searchEngine {
    public String name;

    public searchEngine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "searchEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
