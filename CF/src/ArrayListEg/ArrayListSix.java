package ArrayListEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSix {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sona");
        enames.add("Priya");
        enames.add("Amith");

        //sorting cannot be done in heterogeneous arraylist
        //sort arraylist Objects
        //how to sort-using utility class i.e Arrays,Collections
        System.out.println(enames);      //Before Sorting
        Collections.sort(enames);        //natural sorting
        Collections.sort(enames,Collections.reverseOrder());  //reverse order
        System.out.println(enames);
    }
}
