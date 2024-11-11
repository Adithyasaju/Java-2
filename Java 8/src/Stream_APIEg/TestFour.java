package Stream_APIEg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFour {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //List<Integer> odd_Numbers=numbers.stream()  -->for odd numbers
        List<Integer> even_Numbers=numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(even_Numbers);
        //System.out.println(odd_Numbers);

        numbers.stream().forEach(number->System.out.println(number));
        numbers.stream().forEach(System.out::println);
    }
}
