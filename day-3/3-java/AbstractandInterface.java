
interface Drawable{
   void draw();

} 
abstract class Area{
    abstract double area();
}

class Circle extends Area implements Drawable{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
    @Override
    public void draw(){
        System.out.println("Draw circle");
    }

}
class Rectangle extends Area implements Drawable{
double length;
double width;
Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
double area(){
    return 2*length*width;
}
public void draw(){
    System.out.println("Draw rectangle");
}
}
public class AbstractandInterface {
    public static void  main(String[] args){
        Circle c = new Circle(5);
        System.out.println("Area of the circle = "+c.area());
        c.draw();
        Rectangle r=new Rectangle(4,6);
        System.out.println("Area of the rectangle = "+r.area());
        r.draw();

    }
}
