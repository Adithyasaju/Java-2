package DateandTimeAPI_Eg;

import java.time.LocalDate;
import java.time.LocalTime;

//print current date and time
public class Test {
    public static void main(String[] args) {
         LocalDate dt=LocalDate.now();
        LocalTime time=LocalTime.now();

        System.out.println(dt);
        System.out.println(time);
        System.out.println(dt.getYear()+":"+dt.getDayOfYear()+":"+dt.getMonth());
        System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
    }
}
