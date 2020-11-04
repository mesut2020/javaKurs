package Day23_Java_Methods;

class IslemMain {
    public static void main(String[] args) {
        new Islem(2)
                .topla(2)
                .carp(5)
                .bol(3)
                .sonucYaz();

        double snc = new Islem(2)
                .topla(2)
                .carp(5)
                .bol(3)
                .sonuc();

        System.out.printf("%.2f%n", snc);
    }
}

class Islem {
    private double num;

    public Islem(double num){
        this.num = num;
    }

    Islem topla(double val){
        num += val;
        return this;
    }

    Islem carp(double val){
        num *= val;
        return this;
    }

    Islem bol(double val){
        num /= val;
        return this;
    }

    Islem cikart(double val){
        num -= val;
        return this;
    }

    double sonuc(){
        return num;
    }

    void sonucYaz(){
        System.out.printf("%.2f%n", num);
    }

}
