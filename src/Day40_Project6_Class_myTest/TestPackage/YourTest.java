package Day40_Project6_Class_myTest.TestPackage;

import Day40_Project6_Class_myTest.Settings.UserNameAndPassword;
import Day40_Project6_Class_myTest.Settings.UserSettings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass() {

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


      /*

    KOD BURDAN BAŞLIYOR

     UserNameAndPassword class setUsername method TEST EDİN

    Bütün ihtimalleri check edin

    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

     */


    @Test
    public void testSetUsername1() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Jerre");
        String expected = "Username length should be more then 6";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetUsername2() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Jerremy 3@gmail.com");
        String expected = "Username should not contain space";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testSetUsername3() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Jerremy3gmail.com");
        String expected = "Username should contain @ symbol";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetUsername4() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Jerremy3@gmail.com");
        String expected = "Username should be unique";

        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSetUsername5() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Jerremy4@gmail.com");
        String expected = "jerremy4@gmail.com";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetPassword1() {
        UserNameAndPassword myPassword = new UserNameAndPassword();
        String result = myPassword.setPassword("12ab");
        String expected = "Password length more than 5 character";

        Assert.assertEquals(expected, result);
    }
    @Test
    public void testSetPassword2() {
        UserNameAndPassword myPassword = new UserNameAndPassword();
        String result = myPassword.setPassword("123abc");
        String expected = "123abc";

        Assert.assertEquals(expected, result);
    }
    @Test
    public void toStringTest1() {
        UserSettings uSettings = new UserSettings();
        uSettings.City="Rudesheim";
        uSettings.color = "Schwarz";
        String result = uSettings.toString();
        String expected = "username='null\n" +
                "password='null\n" +
                "Address1='null\n" +
                "City='Rudesheim\n" +
                "ZipCode='null\n" +
                "ItemName='null\n" +
                "customText='null\n" +
                "color='Schwarz\n" +
                "wanaCustomText=false\n" +
                "myPrice=0.0";

        Assert.assertEquals("Sizin sonucunuz "+result+" ,olmasi gereken: "+expected,expected, result);
    }
}
