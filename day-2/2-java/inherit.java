// 1--inheritance
// 2--overide
// 3--polymorphism
class Animal{
    String name="pet";
    void sound(){
        System.out.println("pet makes sound");
    }
    void speak(){
        System.out.println("pet speaking");
    }
}
 class Dog extends Animal{
//Overides parent class method
 @Override   
 void speak(){
    System.out.println("dog barks");
 }
}
class Cat extends Animal{
    //Overides parent class method
    @Override
    void speak(){
        System.out.println("cat meows");
    }
}

public class inherit {
    public static void main(String[] args){
        // Dog d=new Dog();
        // Cat c = new Cat();
        // polymorphism--upcasting
        Animal d = new Dog();
        Animal c =new Cat();
        System.out.println(d.name);
        d.sound();
        d.speak();
        c.speak();

    }
}
