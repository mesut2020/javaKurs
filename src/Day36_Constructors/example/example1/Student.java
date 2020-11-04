package Day36_Constructors.example.example1;

public class Student {
    int id;
    String name;
    String surName;
    int sClass;

    // Constructor: yapici metod
    // ilk olusumda yapilmasi istenen islemlerin yazildigi metod
    public Student(int id, String name, String surName, int sClass){
        // this: class in kendisini gosteriyor yani -> Student
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.sClass=sClass;
        //System.out.println("Constructor calsiti.");
    }

    public Student(int id, String name, String surName){
        // this: class in kendisini gosteriyor yani -> Student
//        this.id=id;
//        this.name=name;
//        this.surName=surName;
//        this.sClass=0; // class bilgisi girilmeyecegi icin 0 atadik...
        this(id,name,surName,0);
    }

    public Student(int id, String name){
//        this.id=id;
//        this.name=name;
//        this.surName="";
//        this.sClass=0;
        this(id,name,"",0);
    }

    public Student(int id){
//        this.id=id;
//        this.name="";
//        this.surName="";
//        this.sClass=0;
        this(id,"","",0);
    }

    public Student(){
//        this.id=0;
//        this.name="";
//        this.surName="";
//        this.sClass=0;
        this(0,"","",0);
    }

    public static void printOgrenci(Student st){
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.surName);
        System.out.println(st.sClass);
        System.out.println(st.toString());
    }

    void printPersonArray(Student[] persons){
        for(Student person: persons){
            System.out.println(person);
        }
    }





    //2. yontem icin yazildi
/*    public static Student createStudent(int id, String name, String surName, int sClass){
        Student ogrenci1 = new Student();
        ogrenci1.id = id;
        ogrenci1.name = name;
        ogrenci1.surName = surName;
        ogrenci1.sClass = sClass;

        return ogrenci1;
    }  */

}
