package Day49_Inheritance.task1;

public class Square extends Rectangle{

    public Square(double width) {
        super(width,width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Area=" + getArea() +
                " Circumference =" + getCircumference()+
                '}';
    }
}
