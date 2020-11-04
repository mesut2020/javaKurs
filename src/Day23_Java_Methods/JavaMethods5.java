package Day23_Java_Methods;

import java.util.Scanner;

public class JavaMethods5 {

    public  static double average(String grades)
    {
        double total = 0;
        String[] grArr = grades.split(" ");

        for (int i = 0; i < grArr.length; i++)
        {
            total+=Integer.parseInt(grArr[i]);
        }
        return total/grArr.length;
    }

    public static void main(String[] args) {
        //Kullanıcı bir öğretmendir.
        // Önce ögrencının adı gırılecek,sonra aldıgı farklı mıktardakı notlar gırılecek
        // Ahmet Demir bu okunduktan sonra
        // 80 56 78 90 okutulacak ve ogrencı adı ve ortalaması yazılacak ekrana
        // Ortalama bulma ıslemını bır fonksıyonda yapınız,fakat sonucu yazdırma ıslemını maınde yaptırınız
        //Her ogrencıye farklı sayıda not gırılebılır

        Scanner sc = new Scanner(System.in);

        System.out.println("Ogrencinin adini giriniz : ");
        String name = sc.nextLine();

        System.out.println("Ogrencinin notlari giriniz : ");
        String strGrades = sc.nextLine();

        System.out.println("Average = " +average(strGrades));

    }
}