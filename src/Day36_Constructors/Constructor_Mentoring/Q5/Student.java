package mentoring.constructors2.Q5;
//java program to overload constructors
class Student {
    int id;
    String name;
    int age;

    Student(){
    }

    Student(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(234,"Ayse",29);
        s1.display();
        s2.display();
    }

}
/*
Compilation Fail
 */
