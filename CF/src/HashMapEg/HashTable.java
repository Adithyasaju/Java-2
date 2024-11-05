package HashMapEg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String,String> emp1=new HashMap<String, String>();
        Map<String,String> emp2=new Hashtable<String, String>();
        emp1.put("eid","101");
        emp1.put(null,"Rahul");
        System.out.println(emp1);       //{null=Rahul, eid=101}
        System.out.println(emp2);       //{}

        emp2.put("eid","101");
        emp2.put("ename","Rahul");
        //Null as Key not allowed
        System.out.println(emp2);        //{eid=101, ename=Rahul}
    }
}
