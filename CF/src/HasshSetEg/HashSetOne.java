package HasshSetEg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOne {
    public static void main(String[] args) {
        HashSet hs1= new HashSet();  //allowed heterogeneous
        HashSet<String> hs2=new HashSet<>();  //allowed only String objects
        HashSet<Integer> hs3=new HashSet<>(100);
        HashSet<Float> hs4=new HashSet<>(100,0.9f);

        hs1.add("Rahul");
        hs1.add("Wayanad");
        hs1.add(101);
        hs1.add(45000.45);
        hs1.add("rahul@gmail.com");
        hs1.add(null);

        System.out.println(hs1);

        //Iteration only by for each and iterator

        //foreach
        for(Object obj:hs1){
            System.out.println(obj);
        }

        //Itertator
        Iterator itr= hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
