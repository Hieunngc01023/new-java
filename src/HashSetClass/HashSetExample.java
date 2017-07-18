

package HashSetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;


public class HashSetExample {
    public static void main(String[] args) {
        // mặc định capacity là 16, mỗi
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("jsp");
        set.add(null);
        set.add(null);
        set.add("struts");
        set.add("hibernate");
        set.add("jsp");
        set.add("java");
        Iterator it = set.iterator();
//        set.add("heiu");
        
            while(it.hasNext())
                System.out.println(it.next());
            }
            
    
}
