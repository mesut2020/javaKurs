package Day42_DateAndTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    public ArrayList<User> register(){
        Scanner sc = new Scanner(System.in);
        ArrayList<User> usersList = new ArrayList<>();
        System.out.println("Cikmak icin bosluk girin...");
        //User user = new User();
        int i=0;
        do{
            User user = new User();
            user.name = sc.nextLine();
            if(user.name.trim().equals("")) break; // donguden cikmak icin
            user.registerDate= LocalDateTime.now();
            usersList.add(user); 

        } while(i++<10);

        return usersList;
    }

    public void printHappyUsers(ArrayList<User> happyUsers ){
        System.out.println("Happy Users:");
        for (User user:happyUsers ) {
            if(user.registerDate.getSecond()<=10)
                System.out.printf("%-20s%-20s\n",user.name, user.registerDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy  HH.mm.ss")));
        }
    }

    public void printAllUsers(ArrayList<User> happyUsers ){
        System.out.println("All Users : ");
        for (User user:happyUsers ) {
            System.out.printf("%-20s%-20s\n",user.name,
                    user.registerDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy  HH.mm.ss")));
        }
    }
}
