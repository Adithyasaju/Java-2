package Stream_APIEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//to print employees their name starts with r-with or ewithout stream
public class Test4 {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("Rahul","Sona","Priya","Rajni","Rakseh","Mokesh","Alia","sofia","Modi","Amith");
        List<String> new_Names=new ArrayList<String>();

        //foreach
        for(String ename:enames){
            if(ename.startsWith("R")){
                new_Names.add(ename);
            }
        }

        System.out.println(enames);
        System.out.println(new_Names);
    }
}
