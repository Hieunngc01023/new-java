

package ConvertBetweenArrayListandArray;

import java.util.HashMap;
import java.util.Map.Entry;


public class Test {
    public static void main(String[] args) {
        String input = "BetterButter";
        int count =0;
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        char[] toarray = input.toCharArray();
        for(int i=0; i< toarray.length;i++)
        {
            for(int j=0; j< toarray.length; j++)
            {
               if(toarray[i] == toarray[j])
                    count++;
            }
            if(count>1)
            hash.putIfAbsent(toarray[i], count);
            count=0;
        }
         for( Entry<Character, Integer> entry : hash.entrySet())
            System.out.println("Charactor: "+entry.getKey()+"  count:  "+entry.getValue());
    }
   
}
