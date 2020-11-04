package Day36_Constructors.tasks.task1;

public class Book {
    String name;
    int publishYear;
    String autor;

    public Book (String name, int publishYear, String autor){
        this.name =name;
        this.publishYear= publishYear;
        this.autor = autor;
    }

    public Book (String name, int publishYear){
        this.name =name;
        this.publishYear= publishYear;
        this.autor = "";
    }

    public Book (){
        this.name ="";
        this.publishYear= 0;
        this.autor = "";
    }

    public String toString() {
        return name +" / "+ publishYear+" / "+autor;
    }

    public void showInfo(){
        System.out.println(name +" "+ publishYear+" "+autor);
    }

}
