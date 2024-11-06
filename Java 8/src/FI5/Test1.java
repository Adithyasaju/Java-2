package FI5;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface pOne{
    public abstract boolean test(List numbers);
}
                                                       //Userdefined FI
public class Test1 implements pOne{
    @Override
    public boolean test(List numbers) {
        return numbers.isEmpty();
    }

    public static void main(String[] args) {
        pOne obj=new Test1();
        List<Integer> al= Arrays.asList(10,20,30,40);
        boolean result=obj.test(al);
        System.out.println(result);
    }
}
