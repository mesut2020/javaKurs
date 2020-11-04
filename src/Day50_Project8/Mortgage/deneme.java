package Day50_Project8.Mortgage;
class MyClass {
    int a=2;int b=5;

    public boolean equals(Object x) {
        MyClass that = (MyClass)x;
        return this.a == that.a;
    }
    public int hashCode1() { return a; }
    public int hashCode2() { return a+b; }
    public int hashCode3() {
        return (int)Math.random();
    }
}
public class deneme {
    public static void main(String[] args) {

        MyClass cl = new MyClass();
        System.out.println(cl.equals(cl));
        System.out.println(cl.a);
        System.out.println(cl.b);

        System.out.println(cl.hashCode1());
        System.out.println(cl.hashCode2());
        System.out.println(cl.hashCode3());

    }
}
