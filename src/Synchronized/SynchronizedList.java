

package Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SynchronizedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("Strust");
        list.add("Jsp");
        list.add("servlets");
        list.add("JsF");
       List<String> synchronizedList = Collections.synchronizedList(list);
//       for(String ite : synchronizedList)
//            System.out.println(ite);
     Iterator it = synchronizedList.iterator();
     while(it.hasNext())
            System.out.println(it.next());
//        synchronized(synchronizedList)
//        {
//            Iterator<String> it = synchronizedList.iterator();
//            while(it.hasNext())
//                System.out.println(it.next());
//        }
        System.out.println(synchronizedList.get(0));
    }
}
