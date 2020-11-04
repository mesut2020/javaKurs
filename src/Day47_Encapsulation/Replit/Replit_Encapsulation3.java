package Day47_Encapsulation.Replit;

import java.util.Scanner;

public class Replit_Encapsulation3 {

   /* Burada iki class vardır. Biri Main diğeri ise Subscribe.

            Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.    String name    boolean doYouWanaSubscribe    String whichMember
3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold

    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria.
    Your membership is 40 dollar for month you can enjoy the videos, all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks    yazdırınız.*/


        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            String name = scan.nextLine();
            String whichMember = scan.nextLine();  //String  whichMember = scan.nextInt();
            boolean  doYouWanaSubscribe  = scan.nextBoolean(); // replit en son true/false giriliyor.

            //  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.
            Subscribe user = new Subscribe(name, doYouWanaSubscribe, whichMember);
            if(user.doYouWanaSubscribe()) {
                if (user.getWhichMember().equalsIgnoreCase("gold"))
                    System.out.println("Welcome to membership " + user.getName() + ". Your membership is 40 dollar for month you can enjoy the videos, all homework and see you soon.");
                else if (user.getWhichMember().equalsIgnoreCase("silver"))
                    System.out.println("Welcome to membership " + user.getName() + ". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
                else
                    System.out.println("Welcome to membership " + user.getName() + ". Your membership is 10 dollar for month you can enjoy the videos.");
            }
            else System.out.println("See you "+user.getName()+" when you want to be a member. Thanks"); // user.getName() eklemek gerekti
        }
    }

    class Subscribe{
        private String name;
        private boolean doYouWanaSubscribe;
        private String whichMember;

        public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember){
            setName(name);
            setDoYouWanaSubscribe(doYouWanaSubscribe);
            setWhichMember(whichMember);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean doYouWanaSubscribe() {
            return doYouWanaSubscribe;
        }

        public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
            this.doYouWanaSubscribe=doYouWanaSubscribe;
        }

        public String getWhichMember(){
            return whichMember;
        }

        public void setWhichMember(String whichMember) {
            this.whichMember = whichMember;
        }
    }


