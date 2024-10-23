package ArrayListEg;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList(); //allowed heterogenoues elements
        ArrayList<String> enames=new ArrayList<String>(); //allowed only string objects
        enames.add("Rahul");
        enames.add("Sona");
        enames.add("Priya");
        System.out.println(enames);

        //print size of arrayList
        System.out.println(enames.size());
        //verify is empty list or not
        System.out.println(enames.isEmpty());
        //verify element/object present in the list or not
        System.out.println(enames.contains("Rahul"));
    }
}
