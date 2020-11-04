package mentoring.constructors2.Q2;

class T {
    int t = 20;

    T() {
        t = 40;
    }

}
class Main {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println(t1.t);


    }
}
/*
20
40
0
Compilation Fail
 */
