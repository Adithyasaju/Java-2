package FI6;

import java.util.Random;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) {
        Random r=new Random();                                  //To get random ouptut value
        Supplier<Integer> s1=()->r.nextInt(100);  //bound->upto (100)value
        Supplier<Float> s2=()->r.nextFloat();
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
