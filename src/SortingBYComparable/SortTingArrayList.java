

package SortingBYComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class SortTingArrayList {
   int rollNO;
   String rollName;

    public SortTingArrayList(int rollNO, String rollName) {
        this.rollNO = rollNO;
        this.rollName = rollName;
    }
   
    public static void main(String[] args) {
        ArrayList<SortTingArrayList> list = new ArrayList<SortTingArrayList>();
        list.add(new SortTingArrayList(2,"hiue"));
        list.add(new SortTingArrayList(1,"nguyen"));
        list.add(new SortTingArrayList(3,"ngoc"));
       Collections.sort(list);// We can't sort List element don't implement Comperable interface.
       // String and Wrapper class implement Coperable inteface default.
        
    }
}
