package Day50_BayramOdev;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {
    public static void main(String[] args) {
        School school1 = new School("Ataturk Ilkogretim Okulu", 300);
        int counter=0;
        do {
            List<Student> students = new ArrayList<>();
         school1.registerStudent(students);
         counter++;
            }while(counter<2);
        counter=0;
        do {
            List<Employee> employees = new ArrayList<>();
            school1.registerEmployee(employees);
            counter++;
        }while(counter<2);

        System.out.println(school1);

    }



}
