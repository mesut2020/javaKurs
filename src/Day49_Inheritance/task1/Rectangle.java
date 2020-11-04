package Day49_Inheritance.task1;

public class Rectangle extends Shape {
    private double width;
    private double heighth;

    public Rectangle(double width, double length){
        this.heighth=length;
        this.width=width;

    }

    @Override
    public double getArea() {
        return this.heighth*this.width;
    }

    @Override
    public double getCircumference() {
        return 2*(this.width+this.heighth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Area=" + getArea() +
                " Circumference =" + getCircumference()+
                '}';
    }

}
