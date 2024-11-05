package HasshSetEg;

import java.util.HashSet;
//Perform union and intersection

public class HashSetEgTwo {
    public static void main(String[] args) {
        HashSet<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        HashSet<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        //Union Operation
        /*s1.addAll(s2);
        System.out.println(s1);*/      //[1,2,3,4,5,6]

        //Intersection Operation
       /* s1.retainAll(s2);
        System.out.println(s1);*/    //[3,4]

        //To get only s1(one set)
       /* s1.removeAll(s2);
        System.out.println(s1);*/   //[1,2]

        //Contains all
        s1.containsAll(s2);
        System.out.println(s1);     //[1,2,3,4]

    }
}
