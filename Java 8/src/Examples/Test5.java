package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(13,34,41,331,431,33,3000);
        List<String> new_Number=numbers.stream()
                .map(num->String.valueOf(num))
                .filter(num->num.startsWith("3"))
                .collect(Collectors.toList());
        System.out.println(new_Number);             //[34, 331, 33, 3000]
    }
}
