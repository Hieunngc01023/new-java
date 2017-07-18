

package VectorClass;

import java.util.Vector;


public class MainClass {
    public static void main(String[] args) {
        // Creating vector object with capacity of 3 elements
        Vector<Integer> vector = new Vector<Integer>(3);
        System.out.println(vector.capacity());
       // Add
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);// what happen?
        System.out.println(vector.capacity());
        
        
    }
}
