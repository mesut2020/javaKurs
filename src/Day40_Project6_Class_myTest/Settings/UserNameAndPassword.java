package Day40_Project6_Class_myTest.Settings;

import java.util.ArrayList;

public class UserNameAndPassword {

//         addUserToList METHODUNU değiştirmeyin//
//        addUserToList UserNameLists a   default email address ekliyor
    private String userName;
    private String password;
    static ArrayList<String> UserNameLists = new ArrayList<>();

    public void addUserToList() {

        UserNameLists.add("jerremy1@gmail.com");
        UserNameLists.add("jerremy2@gmail.com");
        UserNameLists.add("jerremy3@gmail.com");
    }

     //Parametresi String Username ve String Password olan  bu constructor
    // SetUsername ve setPassword methodlarını çağıran bu constructordır.

    public UserNameAndPassword(String Username, String Password) {
        setUsername(Username);
        setPassword(Password);
    }

        //Given default constructor.  Boş constructor verilmiştir

    public UserNameAndPassword() {

    }

       //Create a private String userName and password
       //Create a Arraylist . Arraylist type should be String. ArrayList should be static . Name is UserNameLists


    /*
           türü String ve parametresi String(myUsername) olan
           setUsername adında bir method oluşturun

           Eğer myUsername length 6 dan küçük ise
           Username length should be more then 6 return et.

            Eğer myUsername boşluk(" ") içeriyorsa
            Username should not contain space return et

            Eğer myUsername  @ sembolü içermiyorsa
            Username should contain @ symbol return et

            Eğer UserNameLists de  myusername varsa
            Username should be unique return et

            Eğer bunların hepsi false ise
           private userName = myUsername

           ve userName return et
       */
     public String setUsername(String myUsername) {
        myUsername=myUsername.toLowerCase();
        if (myUsername.length() < 6) return "Username length should be more then 6";
        else if (myUsername.contains(" ")) return "Username should not contain space";
        else if (!myUsername.contains("@")) return "Username should contain @ symbol";
        else if (UserNameLists.contains(myUsername)) return "Username should be unique";
        else userName = myUsername;

        return userName;
    }

 /*
    Return türü String ve parametresi String(myPassword) olan setPassword methodunu oluşturun

    Eğer myPassword length  5 ten küçük veya eşit ise
     Password length more then 5 character  return edin

    Eğer ilk condition false ise
    private password variable  myPassword a eşittir
    ve   myPassword return et
     */


    public String setPassword(String myPassword) {

        if (myPassword.length() <= 5) return "Password length more than 5 character";
        else password = myPassword;

        return password;
    }
}