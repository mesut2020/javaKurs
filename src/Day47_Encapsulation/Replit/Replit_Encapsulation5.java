package Day47_Encapsulation.Replit;

import java.util.Scanner;

public class Replit_Encapsulation5 {

   /* Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.

    bookName ve authorName (String ile)

    Book class'ını kapsülleyin. (Encapsulate)

    Main class'ın içine object  oluşturun ve sonucu yazdırınız.


            "Book name is BOOKNAME and Author is AUTHORNAME"
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String bookName = scan.nextLine();
        String authorName  = scan.nextLine();


//BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Book book = new Book(bookName,authorName);
        bookName = scan.nextLine();
        authorName  = scan.nextLine();

        System.out.println(book);

    }
}

class Book{
    private String bookName,authorName;

    public Book (String bookName,String authorName){
        this.bookName=bookName;
        setAuthorName(authorName);
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }

    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return authorName;
    }

    public String toString(){

        return "Book name is "+getBookName() +" and Author is "+getAuthorName();

    }
}



