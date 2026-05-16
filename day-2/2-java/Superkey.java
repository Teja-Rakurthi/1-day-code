class Animal {

    Animal(String name) {
        System.out.println("Animal name is " + name);
    }
}

class Dog extends Animal {

    Dog() {
        super("Dog");
    }
}

public class Superkey {

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}