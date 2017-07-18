

package Generic;

import java.util.ArrayList;


public class WildCardwithLowerBound {
    public static void Travers(ArrayList<? super Integer> list)
    {
        for(Object element : list)
            System.out.println(element);
    }
    public static void main(String[] args) {
        
        ArrayList<Number> a1 = new ArrayList<Number>();
 
        a1.add(10);
 
        a1.add(20);
 
        a1.add(30);
 
        WildCardwithLowerBound.Travers(a1);
        
        System.out.println("=================");
         ArrayList<Double> a2 = new ArrayList<>();
 
        a2.add(21.35);
 
        a2.add(56.47);
 
        a2.add(78.12);
 
        //This will not work
 
//        WildCardwithLowerBound.Travers(a2);     //Compile time error
    }
        
    
}
