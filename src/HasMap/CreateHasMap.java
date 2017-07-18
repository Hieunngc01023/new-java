

package HasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;


public class CreateHasMap {
    
    private static void Add(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("On1", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Five", 6);
        map.put(null, 7);
        map.put(null, 8);
        // Print map
        for(Entry<String, Integer> entry : map.entrySet())
            System.out.println("Key la:" +entry.getKey() +"\tgia tri la: "+entry.getValue());
        System.out.println("================================");
      // Insert a HashMap to another HashMap
            HashMap<String, Integer> anothermap = new HashMap<String, Integer>();
        anothermap.put("nine", 9);
        anothermap.put("ten", 10);
        // add a element to HashMap if and only if that element not present in HashMap
        anothermap.putIfAbsent("elevent", 11);
        anothermap.putIfAbsent("elevent" , 12);
        
        map.putAll(anothermap);
        for(Entry<String, Integer> entry : map.entrySet())
            System.out.println("key: "+entry.getKey() +"\tvalue: "+entry.getValue());
        System.out.println("========================");
    }
    private static void Get(){
        // Using method get to get value of key specifie
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("for", 4);
        System.out.println(map.get("for"));
        System.out.println(map.getOrDefault("five", 1));
        System.out.println("=====================");
    }
    private static void CheckExistKeyorValue(){
        HashMap<String, Integer> map=  new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 2);
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(2));
        System.out.println("================");
    }
    private static void replace(){
     HashMap<String, Integer> map=  new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 2);
       map.replace("three", 4);
      
       for(Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() +"     "+ entry.getValue());
    }
    public static void main(String[] args) { 
        // tọa hashmap với giá trị capacity là mặc định là 16
       HashMap<String, Integer> map1 = new HashMap<String, Integer>();
       //Chỉ định số lượng capacity cần thiết. Mỗi lần tăng 0.75f
       HashMap<String, Integer> map2 = new HashMap<String, Integer>(20);
       // CHỉ định dõ số lượng tăng lên,
      HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);
      HashMap<String, Integer> map4 = new HashMap<>(map1);
      Add();
      Get(); 
       CheckExistKeyorValue();
       replace();
       CreateHasMap obj = new CreateHasMap();
        System.out.println(obj.hashCode());
        Integer i= 705927765;
        System.out.println(i.hashCode());
    }
}
