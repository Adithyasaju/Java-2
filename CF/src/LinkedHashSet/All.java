package LinkedHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class All {
    public static void main(String[] args) {
       ArrayList<String> enames1= new ArrayList<String>();               //[Rahul, Sonia, Priya, Rahul, Amith, Ram]
       LinkedList<String> enames2=new LinkedList<String>();              //[Rahul, Sonia, Priya, Rahul, Amith, Ram]
       HashSet<String> enames3=new HashSet<String>();                    //[Rahul, Priya, Amith, Sonia, Ram]
       LinkedHashSet<String> enames4=new LinkedHashSet<String>();        //[Rahul, Sonia, Priya, Amith, Ram]
        enames2.add("Rahul");
        enames2.add("Sonia");
        enames2.add(null);
        enames2.add("Priya");
        enames2.add("Rahul");
        enames2.add("Amith");
        enames2.add("Ram");

        System.out.println(enames2);
        System.out.println(enames2.size());
        System.out.println(enames2.isEmpty());
        System.out.println(enames2.contains("Rahul"));
    }
}
