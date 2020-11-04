package Day38_AccessModifiers.nonAccessModifier.staticModifier;

public class Students {

    public static void main(String[] args) {
        Student ogr1=new Student("Ali","Yılmaz");
        Student ogre=new Student("Ayse","Demir");
        Student ogr3=new Student("Deniz", "Kaynak");
//        ...
//        ...
//        ...
        Student ogrenci=new Student("Malik","Demir");

        System.out.println("Student.ogrenciSayisi = " + Student.ogrenciSayisi);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogre = " + ogre);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogrenci = " + ogrenci);
    }
}
// Static anahtar ının 3 adet kullanım amacı var.
// 1- Metoda ve fileda direk class üzerinden ulaşım.
// 2- Tekrarlanan ifadeler için hafızayı iyi kullanma
// 3- Oluşturulan nesneler için sayaç görevi için de kullanılır.