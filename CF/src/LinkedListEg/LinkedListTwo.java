package LinkedListEg;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {
    public static void main(String[] args) {
        LinkedList<String> enames=new LinkedList<>();
        LinkedList data =new LinkedList();
        enames.add("Rahul");   //Index 0
        enames.add("sonia");   //1
        enames.add("priya");   //2
        enames.add("Ram");     //3
        enames.add("Amith");   //4

        System.out.println(enames);

       //sort LinkedList Object
        Collections.sort(enames);
        System.out.println(enames);
        //reverse
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);


    }
}
