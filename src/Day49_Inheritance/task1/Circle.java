package Day49_Inheritance.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius =radius;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Circumference =" + getCircumference()+
                '}';
    }
}
