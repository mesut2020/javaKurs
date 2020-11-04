package Day40_Project6_Class_myTest.Settings;

public class UserSettings {

   //Bütün variables lar  public

    public String username;
    public String password;
    public String Address1;
    public String City;
    public String ZipCode;
    public String ItemName;
    public String customText;
    public String color;
    public boolean wanaCustomText;
    public double myPrice;

    /*      toString methodunu oluşturun
            Bütün variables ları aşağıdaki gibi return et

                   "\nusername : " + username +
                   "\npassword :" + password +
                   "\nAddress1 " + Address1+
                    ........
        */
    public String toString() {
        return
        "username='" + username  +
        "\npassword='" + password  +
        "\nAddress1='" + Address1  +
        "\nCity='" + City +
        "\nZipCode='" + ZipCode  +
        "\nItemName='" + ItemName  +
        "\ncustomText='" + customText  +
        "\ncolor='" + color  +
        "\nwanaCustomText=" + wanaCustomText +
        "\nmyPrice=" + myPrice;
    }

}

//return
//        "\nusername='" + username  +
//        "\npassword='" + password  +
//        "\nAddress1='" + Address1  +
//        "\nCity='" + City +
//        "\nZipCode='" + ZipCode  +
//        "\nItemName='" + ItemName  +
//        "\ncustomText='" + customText  +
//        "\ncolor='" + color  +
//        "\nwanaCustomText=" + wanaCustomText +
//        "\nmyPrice=" + myPrice
//        ;
//        }
