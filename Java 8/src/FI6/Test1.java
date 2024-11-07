package FI6;
@FunctionalInterface
interface  Sone{
    public abstract int get();
}
public class Test1 implements Sone{
    public int get(){
        return 100;
    }

    public static void main(String[] args) {
        Test1 obj=new Test1();                               //FI without lambda expression
        System.out.println(obj.get());
    }
}
