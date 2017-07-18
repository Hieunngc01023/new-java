

package VectorClass;
import java.util.ArrayList;
import java.util.Collection .*;
import java.util.Enumeration;
import java.util.Vector;

public class VecterExample {
    public static void main(String[] args) {
        
    
    Vector<String> vec = new Vector<String>(2);
    vec.addElement("Apple");
    vec.addElement("Orange");
    vec.addElement("Mango");
    vec.addElement("Fig");
        System.out.println("Size is" +vec.size());
        System.out.println("Default capacity increment is:" +vec.capacity());
    vec.addElement("Fruit1");
    vec.addElement("Fruit2");
    vec.addElement("Fruit3");
        System.out.println("Size after addition: " +vec.size());    
        System.out.println("Capacity after increment is : " +vec.capacity());
        
         vec.addElement("Fruit4");
          vec.addElement("Fruit5");
          System.out.println("Size after addition: " +vec.size());    
        System.out.println("Capacity after increment is : " +vec.capacity());
        
     Enumeration en = vec.elements();
        System.out.println("Elements are");
        while(en.hasMoreElements())
            System.out.print(en.nextElement()+" ");
        for(String a : vec)
            System.out.println(a);
        vec.remove(0);
        System.out.println(vec.get(0));
      
}
}
