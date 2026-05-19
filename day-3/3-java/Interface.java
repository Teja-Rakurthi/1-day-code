// interface--multiple inheritance
interface Drawable {
    void draw();
}

interface Printable {
    void print();
}

class Demo implements Drawable, Printable {

    public void draw() {
        System.out.println("Draw");
    }

    public void print() {
        System.out.println("Print");
    }
}
public class Interface {
    public static void main(String [] args){
        Demo d = new Demo();
        d.draw();
        d.print();
    }
}
