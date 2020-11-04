package Day55_AbstractClass;

public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
        }
     public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
         System.out.println(one.name);
        Grasshopper two = new Grasshopper("g2");
         System.out.println(two.name);
         one = two;
         System.out.println(one.name);
         two = null;
         System.out.println(one.name);
         one = null;
         System.out.println(two.name);
     }
 private String name;
}
