package HashMapEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapOne {
    public static void main(String[] args) {
        ArrayList Al = new ArrayList(Arrays.asList(101,102,103));
        HashMap<String,String> emp=new HashMap<String, String>();
        System.out.println(Al);   //[101, 102, 103]
        System.out.println(emp);  //{}
        emp.put("eid","101");
        emp.put("ename","Rahul");
        emp.put("esal","45000.45");
        emp.put("loc","Bangalore");
        System.out.println(emp);      //{eid=101, loc=Bangalore, ename=Rahul, esal=45000.45}

        //display all - map object values "get method
        System.out.println(emp.get("eid"));   //101
        System.out.println(emp.get("ename"));  //Rahul
        System.out.println(emp.get("esal"));   //45000.45
        System.out.println(emp.get("loc"));   //Bangalore
    }
}
