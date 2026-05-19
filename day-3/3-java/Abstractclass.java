// Abstract class and methods
abstract class shape{
    abstract double area();
}
class circle extends shape{
    double area(){
        double result=3.14*6;
        return result;
    }
}
class rectangle extends shape{
    double area(){
        double result=2*4*6;
        return result;
    }

}

public class Abstractclass {
    public static void main(String[] args){
        circle c = new circle();
        rectangle r=new rectangle();
        System.out.println(c.area());
        System.out.println(r.area());
    }
}
