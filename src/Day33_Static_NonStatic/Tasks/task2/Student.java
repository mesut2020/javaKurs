package Day33_Static_NonStatic.Tasks.task2;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;

    public static Student createStudent(String name, int maxCredit){
        Student newStudent = new Student();
        newStudent.name=name;
        newStudent.maxCredit=maxCredit;
        return newStudent;
    }

    public int totalCredit(){
        int total=0;
        for (Lesson ders: dersListesi) {
            total+=ders.credit;
        }
        return total;
    }

    public static void addLessontoStudent(ArrayList<Lesson> dersListesi, Lesson ders){
        dersListesi.add(ders);
    }

    public static void derslerYaz(ArrayList<Lesson> dersler){
        for (Lesson ders: dersler) {
            System.out.println("dersListesi = " + ders.name);
        }

    }
}
