

package collection.ArrayList.LearnArraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1{
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       // Adding
       numbers.add(10);
       numbers.add(100);
       numbers.add(40);
       
       // retrieving 
        System.out.println(numbers.get(0));
       
        System.out.println("nIteration #1");
        // Indexed for loop iteration
        for(int i=0 ; i<numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
        // removing items (careful!)
        numbers.remove(numbers.size()-1);
        numbers.remove(10);
        // this is very slow
        numbers.remove(0);
        
        System.out.println("nIteration #2");
        for(Integer value : numbers)
        {
            System.out.println(value);
        }
        
        List<String> values = new ArrayList<String>();
        
       // edit a object at specified
        numbers.set(0, 18);
        System.out.println("---------");
       for(Integer value : numbers)
        {
            System.out.println(value);
        }
        System.out.println("-----");
       int i = numbers.remove(0);
        System.out.println(i);
        
        
    }
}

