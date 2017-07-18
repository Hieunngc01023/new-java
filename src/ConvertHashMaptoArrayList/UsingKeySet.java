

package ConvertHashMaptoArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingKeySet {
    
private static void UsingKey(){
   // Conversion by Hashmap keys.
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Hieu", "Nguyen");
        map.put("Lop", "Hoc");
        map.put("Truong", "Thu vien");
        map.put("San", "Vuon");
        map.put("Danh", "Bai");
        
        Set<String> keyset = map.keySet();
        ArrayList<String> listofKeys = new ArrayList<String>(keyset);
        for(String list : listofKeys)
            System.out.println(list);
        System.out.println("=========================");
}
private static void UsingValue(){
    // convert by value
    HashMap<String, String> map = new HashMap<String, String>();
     map.put("Hieu", "Nguyen");
        map.put("Lop", "Hoc");
        map.put("Truong", "Thu vien");
        map.put("San", "Vuon");
        map.put("Danh", "Bai");
        Collection<String> keyset = map.values();
        ArrayList<String> list = new ArrayList<>(keyset);
       Iterator<String> ite =  list.iterator();
       while(ite.hasNext())
           System.out.println(ite.next());
       System.out.println("==============");
}
private static void UsingEntry(){
    // using entryset() return a Set of EntrySet<k,v>
HashMap<String, String> map = new HashMap<String, String>();
     map.put("Hieu", "Nguyen");
        map.put("Lop", "Hoc");
        map.put("Truong", "Thu vien");
        map.put("San", "Vuon");
        map.put("Danh", "Bai");
        Set<Map.Entry<String, String>> list  = map.entrySet();
        ArrayList<Entry<String, String>> arr = new ArrayList<Entry<String, String>>(list);
        for(Entry<String, String> a : arr)
            System.out.println("Key "+a.getKey()+"  " +a.getValue());
        
}
    public static void main(String[] args) {
        UsingKey();
        UsingValue();
        UsingEntry();
    }   
    
}
