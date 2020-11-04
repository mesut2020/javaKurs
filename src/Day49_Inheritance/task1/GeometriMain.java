package Day49_Inheritance.task1;

public class GeometriMain {
    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle(3, 5);
        System.out.println("rec = " + rec);

        Square sq = new Square(5);
        System.out.println("sq = " + sq);

        Circle circle = new Circle(5);
        System.out.println("circle = " + circle);

        System.out.println("circle.getArea() = " + circle.getArea());
    }
}
