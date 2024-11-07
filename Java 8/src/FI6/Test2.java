package FI6;

import java.util.function.Supplier;

public class Test2 {
    static Sone s=()->100;
    public static void main(String[] args) {
        //Sone s=()->100;
       System.out.println(s.get());                         //User defined FI with lambda expression
    }
}
