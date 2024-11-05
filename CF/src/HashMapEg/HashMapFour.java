package HashMapEg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFour {
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

        Set<Map.Entry<String,String>> entries=product.entrySet();

        for(Map.Entry<String,String> entry:entries){
         System.out.println(entry.getKey()+":"+entry.getValue());    /*p_name:Marker pen
                                                                        price:30
                                                                        discount:false
                                                                        p_id:p101
                                                                      */

    }

    }

    }

