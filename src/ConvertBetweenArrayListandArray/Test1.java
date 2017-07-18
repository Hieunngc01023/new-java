

package ConvertBetweenArrayListandArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;


public class Test1 {
    int a; int b; 

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {
        LinkedHashSet<Test1> link = new LinkedHashSet<Test1>();
        link.add(new Test1(1,2));
        link.add(new Test1(3,4));
        link.add(new Test1(5,6));
        ArrayList<String> ar = new ArrayList<>();
//        ListIterator<String> listi=  ar.listIterator();
       
        Iterator it = link.iterator();
        while(it.hasNext())
        {
            Test1 obj = (Test1) it.next();
            System.out.println(obj.a+"    "+obj.b);
        }
    }
}
