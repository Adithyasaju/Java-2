package Optional_Class;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        String ename=null;
        Optional<String> opt =Optional.ofNullable(ename);
        if(opt.isPresent()){
            System.out.println(opt.get().length());
        }
        System.out.println("Gm");
    }
}
