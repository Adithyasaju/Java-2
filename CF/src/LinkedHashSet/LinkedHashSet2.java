package LinkedHashSet;

import java.util.*;

public class LinkedHashSet2 {
    public static void main(String[] args) {

       LinkedHashSet<String> enames=new LinkedHashSet<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add(null);
        enames.add("Priya");
        enames.add("Rahul");
        enames.add("Amith");
        enames.add("Ram");

        System.out.println(enames);

        //Iterations
        for (String ename:enames){
            System.out.println(ename);
        }

        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
