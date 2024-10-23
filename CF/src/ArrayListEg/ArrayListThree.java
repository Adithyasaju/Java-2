package ArrayListEg;

import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList(); //allowed heterogenoues elements
        ArrayList<String> enames=new ArrayList<String>(); //allowed only string objects
        enames.add("Rahul");
        enames.add("Sona");
        enames.add("Priya");
        System.out.println(enames);


    }
}
