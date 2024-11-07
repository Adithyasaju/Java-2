package FI6;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<String> s1=()->"GM";                        //Supplier Functional Interface
        System.out.println(s1.get());

        Supplier<Integer> s2=()->100;
        System.out.println(s2.get());
    }
}
