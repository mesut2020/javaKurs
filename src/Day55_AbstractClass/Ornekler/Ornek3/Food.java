package Day55_AbstractClass.Ornekler.Ornek3;

public abstract class Food {
    private String name;

    public abstract void madeIn();
    public abstract void taste();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
