package ArrayListEg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFive {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sona");
        enames.add("Priya");
        enames.add("Amith");

        //Iterate Arraylist using for loop
        for(int i=0;i<=enames.size()-1;i++){
            System.out.println(enames.get(i));
        }

        //Iterate using while loop
        int i=0;
        while(i<=enames.size()-1){
            System.out.println(enames.get(i));
            i++;
        }

        //Iterate using do while
        int i1=0;
        do{
            System.out.println(enames.get(i1));
            i1++;
        }
        while(i1<=enames.size()-1);

        //Iterate using for each
        for(String ename:enames){
            System.out.println(ename);
        }

        //Iterate Using Iterator
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
