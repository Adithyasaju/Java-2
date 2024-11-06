package FI5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main (String[] args){
        List<Integer> al= Arrays.asList(10,20,30,40);
        System.out.println(al);
        Predicate<List> obj1=numbers->numbers.isEmpty();                  //Inbuilt FI in lambda expression
        System.out.println(obj1.test(al));
    }
}
