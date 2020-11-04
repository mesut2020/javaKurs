package Day32_ClassAndObjects.tasks.task1;

public class Rectangle {
    int width;
    int length;

    int getPerimeter() {
        return 2 * (width + length);
    }

    int getArea() {
        return width * length;
    }

}
