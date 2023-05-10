public class Calc {

    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b +c);
    }
}

class advCalc extends Calc {
    void sub(int a, int b) {
        System.out.println(a - b);
    }
}

