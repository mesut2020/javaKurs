package Day47_Encapsulation.Replit;

import java.util.Scanner;
class student{
    String name;
    int age;

    public student(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Replit_Encapsulation1 {
//    Burada iki adet class vardır. Biri Main, diğeri ise student ,
//    student classı içinde;
//    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.//
//    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.

//    Main classın içinde;//
//    Örnek://
//    age 12'dir.
//    name Steven'dır.//
//    name(isim) olarak;
//"Student name is Steven"//
//    ve//
//    age(yaş) olarak da;
//"He is 12 years old"


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String n1 = scan.nextLine();
            int i1 = scan.nextInt();
            //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

            student student= new student(n1,i1);

            System.out.println("Student name is "+student.getName());
            System.out.println("He is "+ student.getAge() +" years old");

        }
    }





