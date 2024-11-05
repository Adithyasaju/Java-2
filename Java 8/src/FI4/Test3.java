package FI4;
interface Function3{
    public abstract int findLength(String ename);
}
public class Test3 implements Function3{
    public int findLength(String ename){
        return  ename.length();
    }
    public static void main(String[] args){
        Function3 obj=new Test3();
        System.out.println(obj.findLength("Rahul"));
        System.out.println(obj.findLength("Sona"));
    }
}
