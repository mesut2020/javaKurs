package Day34_Class.tasks.task1;

public class Lesson {
    String name;
    int hour;


    public static Lesson createLesson(String name, int hour){
        Lesson newLesson = new Lesson();
        newLesson.name = name;
        newLesson.hour = hour;

        return newLesson;
    }

}