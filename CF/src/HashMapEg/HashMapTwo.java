package HashMapEg;

import java.util.HashMap;
import java.util.Set;

public class HashMapTwo {
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

        Set<String> keys=product.keySet();
        System.out.println(keys);     //[p_name, price, discount, p_id]
        for (String key :keys){
            System.out.println(key+":"+product.get(key));    //p_name:Marker pen
                                                             //  price:30
                                                             //  discount:false
                                                             //  p_id:p101
        }

    }
}
