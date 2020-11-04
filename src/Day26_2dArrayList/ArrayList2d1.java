package Day26_2dArrayList;

import java.util.ArrayList;

public class ArrayList2d1 {

    public static double average(int dersNo,ArrayList<ArrayList<Integer>> gradesArrList){

        double sum=0;

        for (int i=0;i<gradesArrList.get(dersNo).size();i++)
            sum+=gradesArrList.get(dersNo).get(i);
        return sum/gradesArrList.get(dersNo).size();
    }

    public static double averageAll(ArrayList<ArrayList<Integer>> gradesArrList){

        double sum=0;
        int c=0;
        for (int i = 0; i < gradesArrList.size(); i++) {
            for (int j=0;j<gradesArrList.get(i).size();j++)
            { sum+=gradesArrList.get(i).get(j);c++;}
        }
        return sum/c;
    }

    public static double averageExam (ArrayList<ArrayList<Integer>> gradesArrList, int exam){
        double sum=0;
        int c=0;

        for (int i=0;i<gradesArrList.size();i++)
            {
                if (gradesArrList.get(i).size()>=exam+1)  // girilen sinav no su dersin boyutundan buyukse o notu almiyor.
                {
                    sum += gradesArrList.get(i).get(exam);
                    c++;
                }
            }
        return sum/c;
    }

    public static void main(String[] args) {

        // bir metod yazinki, metoda dersin nosunu gonderecegim bana ortalamasini vercek...
        // tum derslerin ortalamasini bulan method yaziniz...
        // Tum derslerdeki 1. sinavin ortalamasini bulan method yazin
        // Eger 4. sinavin ortalamasini istersek. Bunu nasil buluruz.

        // Recursive(Oz Yinelemeli Metodlar) konusu nu arastir...

        ArrayList <ArrayList<Integer>> gradesArrList = new ArrayList<>();

        ArrayList<Integer> mathGrades= new ArrayList<>();
        mathGrades.add(90);
        mathGrades.add(80);
        mathGrades.add(70);

        ArrayList<Integer> turkGrades= new ArrayList<>();
        turkGrades.add(95);
        turkGrades.add(85);
        turkGrades.add(75);

        ArrayList<Integer> chemGrades= new ArrayList<>();
        chemGrades.add(45);
        chemGrades.add(45);
        chemGrades.add(65);
        chemGrades.add(35);

        gradesArrList.add(mathGrades);
        gradesArrList.add(turkGrades);
        gradesArrList.add(chemGrades);

        System.out.println(gradesArrList);
        // size(); kac tane lsite oldugunu verir... yani 3 (math, kim, turk)
        System.out.println("gradesArrList.size() = " +gradesArrList.size());

        for (int i = 0; i < gradesArrList.size(); i++)
            for (int j = 0; j < gradesArrList.get(i).size() ; j++) {
            System.out.println("i. yapraktaki j. notlar = " +gradesArrList.get(i).get(j));
        }

        System.out.println("MathAVE = "+average(0,gradesArrList));
        System.out.println("TurkishAVE = "+average(1,gradesArrList));
        System.out.println("ChemAVE = "+average(2,gradesArrList));

        System.out.println("Butun derslerin ortalamasi = " + averageAll(gradesArrList));

        System.out.printf("\nBirbirinci Sinav = %.2f", averageExam(gradesArrList,0));
        System.out.printf("\nIkinci Sinav = %.2f", averageExam(gradesArrList,1));
        System.out.printf("\nUcuncu Sinav = %.2f", averageExam(gradesArrList,2));
        System.out.printf("\nDorduncu Sinav = %.2f", averageExam(gradesArrList,3));

    }
}
