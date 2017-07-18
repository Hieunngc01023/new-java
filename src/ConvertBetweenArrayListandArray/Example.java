

package ConvertBetweenArrayListandArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class Example {
    private static void convert1(){
        // Convert ArrayList to List using method asList() static of Arrays class. 
        // This method return a List. , and then we cover a List to Arraylist.
   String [] array = new String[] {"Android", "JSb","java","hadoop"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        System.out.println("=====================");
        
}
    private static void convert2(){
        // Using method addAll(L, A) of Collections class. copy a Arraylist to List
   String [] array = new String[] {"Android", "JSb","java","hadoop"};
      ArrayList<String> list = new ArrayList<>();
      Collections.addAll(list, array);
//      Iterator it = list.iterator();
//      while(it.hasNext())
//      {
//            System.out.println(it.next());
//            it.remove();
//        
//      }
      for(int i =0; i<list.size();i++)
          list.remove(i);
      System.out.println(list);
}
    private static void ListtoArrayList(){
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Hieu");
        obj.add("Nguyen");
        obj.add("Ngoc");
        String[] arr = new String [obj.size()];
        obj.toArray(arr);
      for(String a : arr)
            System.out.println(a);
      
    }
    public static void main(String[] args) {
        convert1();
       convert2();
       ListtoArrayList();
    }
}
