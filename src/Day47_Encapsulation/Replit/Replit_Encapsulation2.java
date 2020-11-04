package Day47_Encapsulation.Replit;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Replit_Encapsulation2 {
 /*   Burada iki adet class vardır. Biri Main diğeri ise Employees,

    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;    private String name,    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.

    Main class'ın içinde;
    Örnek:
    Name is Fernando
    Salary is 80000
    dob is 11/23/2000

    main method'un içinde,

    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.

    ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/

     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         String name = scan.nextLine();
         int salary = scan.nextInt();
         scan.nextLine();             // nextInt den sonraki \n karakteri okur, bu yazilmazsa hata verir.
         String dop = scan.nextLine();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

         Employees emp = new Employees(name, salary, dop); // dob -> dop olarak yazilmis
         if(ageCalculator(emp.getDob())>18 ) System.out.println("Welcome to our company "+emp.getName()+" your salary is "+emp.getSalary()+"."); // noktaya dikkat!!!
         else if(ageCalculator(emp.getDob())<18) System.out.println("Come back when you are 18 years old.");
         else System.out.println("we can have inter with you after that you can have a "+emp.getSalary()+" salary");
     }

     public static int ageCalculator(String dob){

         LocalDate today = LocalDate.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

         LocalDate birthDate = LocalDate.parse(dob,formatter);
         Period fark = Period.between(birthDate,today);

         return fark.getYears();
     }

}

    class Employees{
        private String name;
        private int salary;
        private String dob;

        public Employees(String name, int salary, String dob){
            setName(name);
            setSalary(salary);
            setDob(dob);

        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name=name;
        }

        public int getSalary(){
            return salary;
        }

        public void setSalary(int salary){
            this.salary=salary;
        }

        public String getDob(){
            return dob;
        }

        public void setDob(String dob){
            this.dob=dob;
        }



    }



