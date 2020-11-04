package Day31_ClassAndObject.example.ex1;

public class Ex1 {
    // Ayri bir dosyada student class'i tanimlayiniz; fields: name ,grade
    // Ayri bir dosayada class i tanimlayiniz; fileds: name, address,
    public static void main(String[] args) {
        Student ogrenci1=new Student();

        ogrenci1.name = "Ayse";
        ogrenci1.grade = 3;

        // 1. yontem
        School okulu = new School();
        okulu.adress = "Goztepe";
        okulu.name = "Marmara Univesitesi";
        okulu.principalName = "Rektor";
        okulu.tuitionFees = 0;

        ogrenci1.schoolInfo=okulu;

        // 2. yontem
        ogrenci1.schoolInfo= new School();
        ogrenci1.schoolInfo.adress="Goztepe";
        ogrenci1.schoolInfo.name = "Marmara Universitesi";
        ogrenci1.schoolInfo.tuitionFees = 0;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);

        System.out.println("okulu.name = " + okulu.name);
        System.out.println("ogrenci1 = " + ogrenci1.schoolInfo.adress);
        System.out.println("ogrenci1 = " + ogrenci1.schoolInfo.tuitionFees);

        Student ogrenci2=new Student();



    }
}
