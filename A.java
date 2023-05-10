public class A {
    public A() {
        System.out.println("I am a constructor A");
    }
    public A(int a){
        System.out.println("I am a constructor A with int parameter");
    }
}
//        B b = new B();
class B extends A {
    public B() {
        super(5);
        System.out.println("I am a constructor of class B");

    }
    public B(int i) {
        super(i);
        System.out.println( i +"I am a constructor of class B with int parameter");
    }

}
