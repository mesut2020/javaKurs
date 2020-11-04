package Day38_AccessModifiers.nonAccessModifier.staticModifier;

public class Student {
    int id;
    String name;
    String surName;

    static int ogrenciSayisi=0;

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;

        ogrenciSayisi++;

        this.id = ogrenciSayisi;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}