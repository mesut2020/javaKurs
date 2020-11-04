package Day31_ClassAndObject.tasks.task1;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int not;
}
public class Task1 {
    public static void main(String[] args) {
        // create class student with fields:
        // string name, int not
        // Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
        // Daha sonra öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
        // Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.


        Student ogrenci1 = new Student();
        Student ogrenci2 = new Student();
        Student ogrenci3 = new Student();

        ogrenci1.name="Ali";
        ogrenci2.name="Veli";
        ogrenci3.name="Deli";

        ogrenci1.not=95;
        ogrenci2.not=98;
        ogrenci3.not=60;

        ArrayList<Student> ogrList= new ArrayList<>();

        ogrList.add(ogrenci1);
        ogrList.add(ogrenci2);
        ogrList.add(ogrenci3);

        bilgiYazdir(ogrList);

        System.out.printf("Ortalama = %6.2f",notOrtalama(ogrList));
    }

    public static void bilgiYazdir(ArrayList<Student> ogrList){

        for (Student ogr: ogrList ) {
            System.out.println("ogr.name = " + ogr.name + " Notu " +ogr.not);
        }
    }
    
    public static double notOrtalama(ArrayList<Student> ogrList){
        double total=0;
        for (Student ogr: ogrList ) {
            total+=ogr.not;
        }
        return total/ogrList.size();
    }
}
