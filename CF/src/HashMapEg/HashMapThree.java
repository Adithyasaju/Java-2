package HashMapEg;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapThree {
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String, String>();
        System.out.println(product);   //{}
        product.put("p_id","p101");
        product.put("p_name","Marker pen");
        product.put("price","30");
        product.put("discount","false");
       System.out.println(product);     //{eid=101, loc=Bangalore, ename=Rahul, esal=45000.45}

        //print all key:values pairs-using keySet();
        //print all values -using vales();
        //print all key:values -using entrySet();

        Collection<String> values=product.values();
        System.out.println(values);      //[Marker pen, 30, false, p101]
        for(String value:values){
            System.out.println(value);        /* Marker pen
                                                 30
                                                 false
                                                 p101 */
    }


    }

    }

