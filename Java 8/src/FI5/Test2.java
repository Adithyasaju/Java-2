package FI5;

import java.util.Arrays;
import java.util.List;

public class Test2 {
        //static pOne obj=numbers->numbers.isEmpty();    ----->if this statement is executed outside main method  make it as static

    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20,30,40);
        pOne obj2=numbers -> numbers.isEmpty();                       //Userdefined FI in lambda expression
        System.out.println(obj2.test(al));
    }
}
