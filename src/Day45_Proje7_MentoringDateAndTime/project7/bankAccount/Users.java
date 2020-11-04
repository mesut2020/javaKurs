package Day45_Proje7_MentoringDateAndTime.project7.bankAccount;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {



    /*
        Create String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2

        all public
     */


    /*
    --String name ,password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully  değişkenlerini oluşturun.
    --int accountNumber, mountAccount1 , accountNumber2 , amountAccount2   değişkenlerini oluşturun.
    -- hepsi public olsun
     */
    //--------------------------------------------------------------------------------------------------
    public String name;
    public String password;
    public String dateOfBirth;
    public String marriageStatus;
    public String relativeName;
    public String relativeAge;
    public String isTransferedSuceesfully;
    public int accountNumber;
    public  int amountAccount1;
    public int accountNumber2;
    public int amountAccount2;

    //--------------------------------------------------------------------------------------------------
    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */


    /*
    --Parametreleri String name , passwod , dateOfBirth , marriageStatus ve
      Int amountAccount1 , amountAccount2 olan constructor oluşturun

    -- variable name  parameter name e eşittir.
    -- variable password  parameter password a eşittir.
    -- variable amountAccount1  parameter amountAccount1 e eşittir.
    -- variable amountAccount2  parameter amountAccount2 e eşittir.

    --  variable accountNumber   randomNumberCreader methodundan sayı almalı
    --  variable accountNumber2   randomNumberCreader methodundan sayı almalı
    -- variable marriageStatus CheckMariageStatus methodunun  return una eşittir
    -- variable dateOfBirth  checkAge  methodunun return una eşittir
     */
    // Users u1 = new Users("David" , "Villa", "10/02/2000", "married" ,1000 , 2000);
    //--------------------------------------------------------------------------------------------------
public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2){
    this.name = name;
    this.password = password;
    this.amountAccount1 = amountAccount1;
    this.amountAccount2 = amountAccount2;
    this.accountNumber = randomNumberCreader();
    this.accountNumber2 = randomNumberCreader();
    this.marriageStatus = CheckMariageStatus(marriageStatus);
    this.dateOfBirth = checkAge(dateOfBirth);

}


    //--------------------------------------------------------------------------------------------------
    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus is married

        Ask to user (use scanner class)
        Do you want to add add your relative?

        if the user say Yes
        Ask to user
        What is your relative name?
        Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

            if relativeAge equal to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return Transaction done successfully

        If the user say No
        then no need to add anything.
     */


    /*

       -- Parametresi String(marriageStatus) ve return  tipi String olan CheckMariageStatus methodunu oluşturun
       if String marriageStatus is married

       -- Eğer String marriageStatus  married ise

       Kullanıcıya sor ( scanner class kullan)
       Do you want to add add your relative?

       --Eğer kullanıcı Yes derse
       Kullanıcıya sor
       What is your relative name?
       Kullanıcıya sor
       Date of birth relative?

       Sonra  relative(Use AddRelative class ) ekle
       relativeName variable  AddRelative class fullName eşittir
       relativeAge variable  AddRelative class age  eşittir

           --Eğer relativeAge  "0"  a eşit ise
                relativeName i  "Relative should be more then 18 years old";  e değiştir
                relativeAge i  "Relative should be more then 18 years old";   e değiştir
               return   "Relative should be more then 18 years old";   olmalı
           -- Eğer the relativeAge  "0" a eşit değilse
               return Transaction done successfully

      -- Eğer kullanıcı No derse
       hiçbirşey eklemeye gerek yok.
    */
    //--------------------------------------------------------------------------------------------------
    public  String CheckMariageStatus(String marriageStatus) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String str="";
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        if(marriageStatus.equalsIgnoreCase("married")) {
            System.out.println("Do you want to add add your relative?");
            String cvp = sc.nextLine();
            if (cvp.equalsIgnoreCase("yes")) {
                System.out.println("What is your relative name?");
                relativeName = sc.nextLine();
                System.out.println("Date of birth relative?");
                relativeAge = sc.nextLine();
                LocalDate birthDate = LocalDate.parse(relativeAge,formatter);
                Period fark = Period.between(birthDate,today);
                relativeAge = String.valueOf( fark.getYears());

                AddRelative addRelative = new AddRelative(relativeName, relativeAge);
                if (addRelative.age.equals("0")) {
                    relativeName= "Relative should be more then 18 years old";
                    relativeAge= "Relative should be more then 18 years old";
                    str = "Relative should be more then 18 years old";
                }
                else str ="Transaction done successfully";
            }
        }
        return str;
    }





    //--------------------------------------------------------------------------------------------------
    /*
       Create a static method name is checkAge
       parameter is one String(myDOB)
       return type is String

       Compare today date to myDOB

       if myDOB compare to today date is 18 then return "You can get a credit card"

       if myDOB compare to today date is less then 18 "You should be at least 18 years old to get a credit card."

       For example today date is 10/05/2020

       if myDOB is 09/05/2002

       return should be  "You can get a credit card"

       if myDOB is 11/05/2002

       return should be  "You should be at least 18 years old to get a credit card."

    */


    /*

        -- Parametresi String(myDOB) ve return  tipi String olan checkAge static methodunu oluşturun

        -- taday date i myDOB ile karşılaştır

        -- Eğer compare to today date 18 ise "You can get a credit card" et

        -- Eğer compare to today date 18 den küçük ise "You should be at least 18 years old to get a credit card."
        return et.

        Örnek today date  10/05/2020 ise

        Eğer myDOB  09/05/2002 ise

        return   "You can get a credit card"  olmalı

        Eğer   myDOB  11/05/2002  ise

        return  "You should be at least 18 years old to get a credit card."  olmalı

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

        String date = "16-Aug-2016";   //10/02/2000

        LocalDate localDate = LocalDate.parse(date, formatter);

     */
    //--------------------------------------------------------------------------------------------------

public static String checkAge(String myDOB) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String str="";
    LocalDate today = LocalDate.now();
    LocalDate myDOB2 = LocalDate.parse(myDOB,formatter);
    Period fark = Period.between(myDOB2,today);
    if(fark.getYears()>=18) str = "You can get a credit card";
    else str = "You should be at least 18 years old to get a credit card.";

    return str;
}




    //--------------------------------------------------------------------------------------------------
    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */


    /*

       8 basamak sayı döndüren Random sayı oluştur

           Bu sayı  10000000 - 99999999 arasında olamalı

    */
      public static int  randomNumberCreader() {
    return (int)(Math.random()*90000000 +10000000);
    }


    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
            Call the method transferToOwnAccount in the Account class

        if the answer different
            Call the method transferOtherUser in the Account class

     */


    /*

        -- Parametreleri iki tane Users object olan return tipi void olan transfer adında method oluştur.


        -- Bu method içinden
           Önce kullanıcıya sor  "Do you want to transfer between your accounts or different user" ( scanner class kullan)

      - Eğer cevap own ise
            Account class içinde transferToOwnAccount methodunu çağır

      - Eğer cevap farklı ise
           Account class içinde transferOtherUser methodunu çağır


     */
//--------------------------------------------------------------------------------------------------
public void transfer(Users user1, Users user2) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you want to transfer between your accounts or different user");
    String cvp = sc.nextLine();
    if (cvp.equalsIgnoreCase("own")) {
        System.out.println("Enter amount of money you want to enter ");
        Account.transferToOwnAccount(user1, sc.nextInt());
    }
    else {
        System.out.println("Enter amount of money you want to enter ");
        Account.transferOtherUser(user1, user2, sc.nextInt());
    }
}

//--------------------------------------------------------------------------------------------------
    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */


    /*

       toString methodunu kullanarak objecti print et


        return "\nname: " + name +
               "\npassword: " + password+
               "\ndateOfBirth: " + dateOfBirth+
               ......


               gibi

    */
    //--------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return
                "\nname=" + name +
                "\npassword=" + password +
                "\ndateOfBirth=" + dateOfBirth +
                "\nmarriageStatus=" + marriageStatus +
                "\naccountNumber=" + accountNumber +
                "\namountAccount1=" + amountAccount1 +
                "\naccountNumber2=" + accountNumber2 +
                "\namountAccount2=" + amountAccount2 +
                "\nrelativeName=" + relativeName +
                "\nrelativeAge=" + relativeAge ;
                //"\nisTransferedSuceesfully=" + isTransferedSuceesfully ;


    }
}
