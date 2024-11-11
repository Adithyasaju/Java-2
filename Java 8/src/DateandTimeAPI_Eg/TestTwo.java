package DateandTimeAPI_Eg;

import java.time.LocalDate;
import java.time.Year;

//leap yeaer or not
public class TestTwo {
    public static void main(String[] args) {
       /* int year = LocalDate.now().getYear();
        System.out.println(year);
        if(year%4==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }*/

        Year year =Year.of(2023);
        if(year.isLeap()){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
