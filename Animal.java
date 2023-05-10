


public class Animal {
    String name;
    int age;
    String color;
    void walk1() {
        System.out.println("Walking...");
    }
}


class Cat extends Animal {
    void walk1() {
        System.out.println("Cat is walking...");
    }
}

class Dog extends Cat{
    void walk1() {
        System.out.println("Dog is walking...");
    }
}

