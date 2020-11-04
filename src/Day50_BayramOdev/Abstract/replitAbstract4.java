package Day50_BayramOdev.Abstract;
abstract class Data{

    public abstract double getArea();

    final double pi=3.14;

    private int radius, length, width;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
}

class Circle extends Data{

    public double getArea(){
        return pi*getRadius()*getRadius();
    }
}

class Rectangle extends Data{

    public double getArea(){
        return getLength()*getWidth();
    }
}


public class replitAbstract4 {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.getArea());

        Rectangle rec = new Rectangle();
        rec.setLength(5);
        rec.setWidth(20);
        System.out.println(rec.getArea());


    }

}
