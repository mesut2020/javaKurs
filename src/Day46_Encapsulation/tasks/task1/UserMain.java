package Day46_Encapsulation.tasks.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        ArrayList<User> listUsers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String password="";
        String username="";
        boolean usernameIste = true;
        int userCount=0;

        do {
            if (usernameIste) {
                System.out.println((userCount + 1) + ".username : ");
                username = sc.nextLine();
            }

            System.out.println("password : ");
            password = sc.nextLine();

            try {
                    User user = new User(username, password);
                    userCount++;
                    usernameIste=true;
                    listUsers.add(user);
            }
            catch (Exception e) {
                    System.out.println(e.getMessage());
                    usernameIste=false;
            }

        } while(userCount<2);

        for (User user: listUsers) {
            System.out.println(user);
        }

    }
}
