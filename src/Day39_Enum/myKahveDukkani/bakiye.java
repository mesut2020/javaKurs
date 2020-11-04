package Day39_Enum.myKahveDukkani;

public enum bakiye {

    Musteri1(10);
    private double bakiyem;


        private bakiye (double bakiyem){
            this.bakiyem = bakiyem;
        }

        public double getBakiyem(){

            return this.bakiyem;
        }

}
