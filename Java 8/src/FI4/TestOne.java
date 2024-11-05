package FI4;                         //Lambda Expression
interface FunctionI{
    public abstract int squreIt(int num);
}
public class TestOne  {
    public static void main (String[] args){
        FunctionI obj=num->num*num;
        System.out.println(obj.squreIt(10));
        System.out.println(obj.squreIt(4));
    }


}
