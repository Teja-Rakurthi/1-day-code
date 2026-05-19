
class information{
    private int age;

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class PrivateKey {
    public static void main(String[] args){
   information p = new information();
   p.setAge(23);
   System.out.println(p.getAge());
    }
}
