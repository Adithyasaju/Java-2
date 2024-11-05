package LinkedListEg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOne {
    public static void main(String[] args) {
        LinkedList<String> enames=new LinkedList<>();
        LinkedList data =new LinkedList();
        enames.add("Rahul");   //Index 0
        enames.add("sonia");   //1
        enames.add("priya");   //2
        enames.add("Ram");     //3
        enames.add("Amith");   //4

        System.out.println(enames);

        //Iterating using forEach
        for(String ename:enames){
            System.out.println(ename);
        }

        //Usind Iterator
        Iterator itr= enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //for loop
        for(int i=0;i<= enames.size()-1;i++){
            System.out.println(enames.get(i));
        }


    }
}
