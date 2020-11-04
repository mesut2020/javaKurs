package Day33_Static_NonStatic.Tasks.task2;

import java.util.Scanner;

public class Lesson {

    String name;
    int credit;

    public static Lesson createLesson(String name, int credit){
        Lesson newLesson = new Lesson();
        newLesson.name= name;
        newLesson.credit= credit;
        return newLesson;
    }
}
