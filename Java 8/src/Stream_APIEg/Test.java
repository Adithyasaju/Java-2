package Stream_APIEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> enmaes= Arrays.asList("rahul","Sona","Priya");
        ArrayList<String> Users=new ArrayList<String>();
        Users.add("rahul");
        Users.add("Sona");
        Users.add("Priya");
        Users.add("Sam");
        System.out.println(enmaes);
        System.out.println(Users);

        //process Users and convert every user to upper case
        ArrayList<String> new_Users=new ArrayList<String>();
        for(String User:Users){
            new_Users.add(User.toUpperCase());
        }
        System.out.println(new_Users);
    }
}
