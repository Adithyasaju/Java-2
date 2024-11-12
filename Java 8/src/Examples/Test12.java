package Examples;
//second lowest
import java.util.Arrays;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,4,74,17,41);
        int second_Lowest=numbers.stream().sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(second_Lowest);    //17
    }
}
