class Person{
    String name;
    int age;

    // constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // toString()
    public String toString(){
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
public class Classandobject {
    public static void main(String [] args){
        Person p1= new Person("teja",23);
        Person p2= new Person("tejaR",21);

        // p1.name="teja";
        // p1.age=23;
        System.out.println(p1);
        System.out.println(p2);
    }
}