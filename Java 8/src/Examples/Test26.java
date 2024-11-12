package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//print distinct values
public class Test26 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3000,331,4,74,17,41,3000,331,4,74,17,41,3000,331,4,74,17,41);
        List<Integer> distinct_Numbers=numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct_Numbers);
    }
}
