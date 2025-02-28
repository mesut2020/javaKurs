package Day45_Proje7_MentoringDateAndTime.project7.bankAccount;

public class Account {

    /*
        Create a static method name is deposit
        parameters are two int(int accountAmount , int amountToAdd)
        return type is int

        add amountToAdd to accountAmount

     */

    /* ---  iki int olan  (int accountAmount , int amountToAdd) parametresi ve return tipi int olan
           deposit isminde bir static method oluşturun.
        -- accountAmount a  amountToAdd ekle
     */

    //------------------------------------------------------------------------------------------------
   public static int deposit(int accountAmount , int amountToAdd ){
    return accountAmount+amountToAdd;
}



   //--------------------------------------------------------------------------------------------------
    /*
         Create a static method name is withDraw
         parameters are two int(int accountAmount , int withdrawAmount)
         return type is int

         remove withdrawAmount to accountAmount

      */

    /* ---  iki int olan  (int accountAmount , int withdrawAmount) parametresi ve return tipi int olan
           withDraw isminde bir static method oluşturun.
        -- accountAmount dan   withdrawAmount  cıkarın.
     */
    //--------------------------------------------------------------------------------------------------

public static int withDraw(int accountAmount , int withdrawAmount){
    return withdrawAmount-accountAmount;
}





    //--------------------------------------------------------------------------------------------------
    /*
        Create a method name is transferOtherUser
        Parameters are 2 Users(sendingUser , receivingUser) and one int (transferAmount)

        if the transferAmount is bigger then sendingUser amountAccount1 variable
        Then return Sender is poor lol :)

       if the transferAmount is smaller then sendingUser amountAccount1 variable
            Remove 2 percent from the transferAmount
            remove the transferAmount from the sendingUser amountAccount1
            add the transferAmount from the receivingUser  amountAccount1
        Then return Transaction is completed successfully

        For example:
        SendingUser amountAccount1 has 1000 dollar
        receiving user amountAccount1 has 200 dollar

        transferAmount 100
        After the transaction SendingUser amountAccount1 should have 902 dollor
        After the transaction receivingUser amountAccount1 should have 298 dollor

     */


     /* ---  iki tane Users(sendingUser , receivingUser) parametresi ve bir tane int (transferAmount)
            olan transferOtherUser isminde bir static methodu oluşturun.
        --- Eğer  transferAmount büyükse  sendingUser amountAccount1 değişkeninden
            O zaman return   Sender is poor lol :)   olsun
        --- Eğer  transferAmount küçükse  sendingUser amountAccount1 değişkeninden
            - transferAmount 2% azalt
            - sendingUser amountAccount1  den transferAmount cıkart
            - receivingUser  amountAccount1 dan transferAmount ekle
            - ve, Transaction is completed successfully  return et


            Örnek:
        SendingUser amountAccount1  1000 dollar var
        receiving user amountAccount1  200 dollar var

        transferAmount 100
        İşlemden sonra SendingUser amountAccount1  902 doları olmalı
        İşlemden sonra receivingUser amountAccount1  298 doları olmalı
     */
    //--------------------------------------------------------------------------------------------------
     public static String transferOtherUser(Users sendingUser , Users receivingUser, int transferAmount){
        String str ="";
        if(transferAmount>sendingUser.amountAccount1) str="Sender is poor lol :)";
        if(transferAmount<sendingUser.amountAccount1) {
            transferAmount -= transferAmount * 2 / 100;
            sendingUser.amountAccount1-=transferAmount;
            receivingUser.amountAccount1+=transferAmount;
            str = "Transaction is completed successfully";
        }
        return str;
    }








    //--------------------------------------------------------------------------------------------------
    /*
       Create a static method name is transferToOwnAccount
       parameter is One Users object , one int transferAmount
       return type is String

       if the transferAmount is bigger then Users amountAccount1
        return You need more money dude

       if the transferAmount is smaller then Users amountAccount1
          remove the transferAmount from user amountAccount1
          add transferAmount to user amountAccount2

        return Transaction is completed successfully

     */


    /*
         ---  bir tane One Users object ve bir tane int transferAmount parametresi olan
             ve return tipi String olan
            transferToOwnAccount isminde bir static methodu oluşturun.
        --- Eğer  transferAmount büyükse  Users amountAccount1  den
            O zaman return     You need more money dude      olmali
        --- Eğer  transferAmount küçükse  Users amountAccount1   den
            - transferAmount 1% azalt
            - user amountAccount1  dan transferAmount  cikar
            - user amountAccount2 ye transferAmount  ekle
            - ve, Transaction is completed successfully  return et

     */
    //--------------------------------------------------------------------------------------------------
    public static String transferToOwnAccount(Users user , int transferAmount) {
        String str="";
        if(transferAmount> user.amountAccount1)  str ="You need more money dude";
        if(transferAmount< user.amountAccount1) {
            transferAmount-=transferAmount*0.01;
            user.amountAccount1-=transferAmount;
            user.amountAccount2+=transferAmount;

            str = "Transaction is completed successfully";
        }
        return str;
    }

}










