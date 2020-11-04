package Day35_Project5.Laptop;

import Day35_Project5.GameGuess.GuessGame;
import org.junit.Assert;
import org.junit.Test;


public class Test1 {


    @Test
    public void test1(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100000);

        Assert.assertTrue("sonuç 850 olmalı ama senin sonuç " + num,num == 850);
    }

    @Test
    public void test2(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100001);

        Assert.assertTrue("sonuç 750 olmalı ama senin sonuç " + num,num == 750);
    }


    @Test
    public void test3(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100002);

        Assert.assertTrue("sonuç 1100 olmalı ama senin sonuç " + num,num == 1100);
    }


    @Test
    public void test4(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100003);

        int num2 = p1.getPrice(1100004);

        int total = num + num2;

        System.out.println(total);
        total = p1.getDiscount(total , 20);
        System.out.println(total);
        Assert.assertTrue("sonuç 2120 olmalı ama senin sonuç " + total,total == 2120);
    }

    // 530
    @Test
    public void test5(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100006);

        int num2 = p1.getPrice(1100007);

        int total = num + num2;

        total = p1.getDiscount(total , 10);

        Assert.assertTrue("sonuç 1845 olmalı ama senin sonuç " + total,total == 1845);
    }


    @Test
    public void test6(){
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100005);

        int num2 = p1.getPrice(1100008);

        int total = num + num2;

        total = p1.getDiscount(total , 10);

        Assert.assertTrue("sonuç 2025 olmalı ama senin sonuç " + total,total == 2025);

    }

    @Test
    public void GuessGame1(){
        GuessGame p1 = new GuessGame();

        int num = p1.randomGenerator();
        Assert.assertTrue("sonuç 0 ile 100 arasinda olmalı ama senin sonuç " + num,num>=0 && num<=100);
    }


/*

    @Test //(main=GuessGame.class)
    public class SumTest {

        @Rule
        public IOTestRule ioTestRule = new IOTestRule();

        @Test
        @IOTest(input="3\n" +
                "10\n" +
                "2\n" +
                "7\n")
        public void test1() {
            assertEquals("19", ioTestRule.getLastLine());
        }

    }
*/

/*

    @Test
    public void GuessGame2(){
        GuessGame p1 = new GuessGame();

        p1.LetsGuess(50);
        Assert.assertTrue("sonuç 0 ile 100 arasinda olmalı ama senin sonuç ",true);

    }
*/

}
