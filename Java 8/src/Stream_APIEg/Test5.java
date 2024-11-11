package Stream_APIEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//to print employees their name starts with r-with or ewithout stream
public class Test5 {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("Rahul","Sona","Priya","Rajni","Rakseh","Mokesh","Alia","sofia","Modi","Amith");
        //stream
        List<String> new_Names=enames.stream().filter(ename->ename.startsWith("R"))
                        .collect(Collectors.toList());
        //to print employees count their name starts with r
        long no_of_employees=enames.stream().filter(ename->ename.startsWith("R"))
                        .count();
        System.out.println(enames);
        System.out.println(new_Names);
        System.out.println(no_of_employees);
    }
}
