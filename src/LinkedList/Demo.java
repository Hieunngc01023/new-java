

package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arryList = new  ArrayList<Integer>();
        LinkedList<Integer> linkedList = new  LinkedList<Integer>();
        
        doTimings("ArrayList", arryList);
        doTimings("LInkedList ", linkedList);
        System.out.println("=============");
        Retrieve("ArrayList", arryList);
        Retrieve("linklist", linkedList);
    }
    private static void doTimings(String type, List<Integer> list){
        for(int  i=0; i< 1E5; i++)
        {
                list.add(i);  
        }
        long start = System.currentTimeMillis();
        // append thì arraylist nhanh hơn.
        // Add items at end of List.
//         for(int i=0; i<1E5; i++){
//             list.add(i);
//         }
         //Add items alesewhere in List. // insert arraylist chậm hơn.
        for(int i=0; i< 1E5; i++)
        {
            list.add((int) 1E4, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time takien: " +(end-start) +" ms for" +type);
                
    }
    private static void Retrieve(String type, List<Integer> list){
        for(int  i=0; i< 1E5; i++)
        {
                list.add(i);  
        }
        long start = System.currentTimeMillis();
        
            for(int i : list)
            {}
        
        long end = System.currentTimeMillis();
        System.out.println("Time takien: " +(end-start) +" ms for" +type);
    }
}
