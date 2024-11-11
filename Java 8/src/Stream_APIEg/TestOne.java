package Stream_APIEg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestOne {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("rahul","Sona","Priya","Amith");
        List<String> new_Employees=enames.stream()
                .map(ename-> ename.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(new_Employees);
    }
}
