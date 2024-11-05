package FI4;
@FunctionalInterface
interface Function2{
    public abstract int findLength(String ename);
}
public class Test2 {
    public static void main (String[] args){
        Function2 obj=ename -> ename.length();
        System.out.println(obj.findLength("Rahul"));
        System.out.println(obj.findLength("Sona"));
    }
}
