package Day14_Loop;

public class hw_5 {
    public static void main(String[] args) {
        //Bir çalışanın başlangıç maaşı 2000 tl olsun.
        // her yıl %15 zam yapılırsa,
        // 5 yıl sonra çalışanın maaşı kaç lira olur.

        int finalSalary = 2000;
        int counter = 0;

        while(counter <5) {

            finalSalary+= finalSalary*15/100;
            counter++;
        }
        System.out.println("After 5 years, Final salary = " + finalSalary);
    }

}
