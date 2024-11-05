package FI4;

import java.util.function.Function;

public class Test {
    public static void main (String[] args){
        Function <Integer,Integer> obj=a->a*a;                //predefined functional interface
        System.out.println(obj.apply(10));
        System.out.println(obj.apply(5));
    }
}
