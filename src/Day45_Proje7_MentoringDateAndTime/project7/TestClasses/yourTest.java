package Day45_Proje7_MentoringDateAndTime.project7.TestClasses;

import Day45_Proje7_MentoringDateAndTime.project7.bankAccount.Users;
import org.junit.Assert;
import org.junit.Test;

public class yourTest {

    /*
        Create a Test for method in the Users randomNumberCreader

        Check all possible options
     */


    /*
         Users içindeki randomNumberCreader methodu için Test oluştur

        Tüm olası seçenekleri kontrol edin
     */

@Test
    public void randomTest(){
    int actual = Users.randomNumberCreader();
    boolean expected = (actual>10000000 && actual<=99999999);

    Assert.assertTrue(expected);

}




    /*
          Users içindeki checkAge için Test oluştur

        Tüm olası seçenekleri kontrol edin

     */
    @Test
    public void checkAgeTest(){
        String actual =Users.checkAge("10/02/2000");

        Assert.assertTrue(actual.equalsIgnoreCase("You can get a credit card"));
    }

    @Test
    public void checkAgeTest2(){
        String actual =Users.checkAge("11/12/2010");
        Assert.assertTrue(actual.equalsIgnoreCase("You should be at least 18 years old to get a credit card."));
    }
}
