package Day32_ClassAndObjects.tasks.task1;

public class Task1 {
    // 1-Adım: Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2-Adim: Cevre bulmak uzere getPerimeter isminde metod yaziniz.
    // 3-Adim: Diktortgenin alanini bulan getArea isimli metod yaziniz...
    //

    public static void main(String[] args) {
        Rectangle rec1= new Rectangle();

        rec1.width = 5;
        rec1.length = 4;

        System.out.println("rec1.getPerimeter() = " + rec1.getPerimeter());
        System.out.println("rec1.getArea() = " + rec1.getArea());

    }
}
