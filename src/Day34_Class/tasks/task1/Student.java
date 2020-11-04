package Day34_Class.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi = new ArrayList<>();

    public static Student createStudent(String name, int maxCredit) {
        Student newStudent = new Student();

        newStudent.name = name;
        newStudent.maxCredit = maxCredit;

        return newStudent;
    }

    public void addLesson(Lesson ders) {

        int total = 0;
        for (Lesson aldigiDers : dersListesi) {
            total += aldigiDers.hour;
        }

        if (total + ders.hour < maxCredit) dersListesi.add(ders);
        else System.out.println(name + " " + ders.name + "Max ders saatini astiniz. Ders eklenemez.");
    }

    public void printLessons() {
        System.out.println(name +"'nin dersleri = ");

        int aldigiToplamSaat=0;
        for (Lesson ders : dersListesi) {
            System.out.println(ders.name +" " + ders.hour);
            aldigiToplamSaat+=ders.hour;
        }
        System.out.println("aldigiToplamSaat = " + aldigiToplamSaat);
        System.out.println();
    }
}
