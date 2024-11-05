package LinkedListEg;

import java.util.ArrayList;
import java.util.LinkedList;

public class ALvsLLEgOne {
    public static void main(String[] args) {
        ArrayList<String> al_List= new ArrayList<String>();
        al_List.add("Rahul"); //0
        al_List.add("Sonia"); //1
        al_List.add("Priya"); //2
        al_List.add("Amith"); //3
        LinkedList<String > ll_List=new LinkedList<String>();
        ll_List.add("Rahul");
        ll_List.add("Sonia");
        ll_List.add("Priya");
        ll_List.add("Amith");

        System.out.println(al_List);
        System.out.println(ll_List);

        //remove first element from the list
        al_List.remove(0);
        ll_List.removeFirst();

        //remove last element
        al_List.remove(al_List.size()-1);
        ll_List.removeLast();

        System.out.println(al_List);
        System.out.println(ll_List);


    }
}
