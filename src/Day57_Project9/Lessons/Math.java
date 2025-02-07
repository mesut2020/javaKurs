package Day57_Project9.Lessons;


import Day57_Project9.Student.StudentClass;

import java.util.ArrayList;

public class Math extends LessonClass{
   /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Math class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */
   private ArrayList<String> topicList = new ArrayList<>();

    public Math(StudentClass sClass) throws Exception {
        super(sClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList.add("Place Value");
        topicList.add("Compare Whole Numbers");
        topicList.add("Represent Decimals");
        topicList.add("Place Value through Thousandths");
        topicList.add("Multiplication Patterns");
        return topicList;
    }
     /*

    Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Math sınıfı LessonClass sınıfının child sınıfı


   abstract sınıfından gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */

}
