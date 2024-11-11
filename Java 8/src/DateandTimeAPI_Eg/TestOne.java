package DateandTimeAPI_Eg;

import java.time.LocalDate;
import java.time.Period;

//to print age
public class TestOne {
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2002,11,07);
        System.out.println(dob);
        LocalDate cdt=LocalDate.now();
        System.out.println(cdt);
        Period pd=Period.between(dob,cdt);
        System.out.println(pd);
        System.out.println(pd.getYears()+"/"+pd.getMonths()+"/"+pd.getDays());
    }
}
