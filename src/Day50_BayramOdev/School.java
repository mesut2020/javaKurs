package Day50_BayramOdev;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    String name;
    int maxStudents;
    List<Student> students= new ArrayList<>();
    List<Employee> employees= new ArrayList<>();

    public School(String name,int maxStudents){
        this.name=name;
        this.maxStudents=maxStudents;
    }

    public void registerStudent(List<Student> students ){
        Scanner sc= new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("address: ");
        String address = sc.nextLine();

        System.out.print("fee: ");
        int fee = sc.nextInt();

        Student student = new Student(name, address,fee);

        this.students.add(student);
    }

    public void registerEmployee(List<Employee> employees){
        Scanner sc= new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("address: ");
        String address = sc.nextLine();

        System.out.print("salary: ");
        int salary = sc.nextInt();


        Employee employee = new Employee(name, address,salary);

        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "\nSchool" +
                "\nname: " + name +
                "\nmaxStudents: " + maxStudents +
                "\nstudents: " + students +
                "\nemployees: " + employees
                ;
    }
}
