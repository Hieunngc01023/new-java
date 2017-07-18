

package LinhedHashSetClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Example {
   private static void sort( Map<Integer, String> map){
      
        map.put(1, "A");
        map.put(4, "B");
        map.put(2, "C");
        map.put(6, "D");
        map.put(5, "E");
        map.put(9, "F");
        for(Integer key : map.keySet())
            System.out.println("key: " +key+" value: " +map.get(key));
       System.out.println("========================");
}
    public static void main(String[] args) {
          HashMap<Integer, String> map = new HashMap<Integer, String>();
          LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
          TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
          sort(map);
          sort(map1);
          sort(map2);
    }
}
