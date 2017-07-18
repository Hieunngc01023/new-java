

package collection.ArrayList.LearnArraylist;

// Bài toán biêu diễn các phương thức thao tác với  1 nhóm các element

import java.util.ArrayList;

public class BuckArraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new  ArrayList<String>();
        list1.add("One");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        
        System.out.println(list1); // mac dinh goi phuong thuc toString()
        
        ArrayList<String> list2 = new  ArrayList<>();
        list2.add("three");
        list2.add("four");
        list2.add("five");
        list2.add("six");
        list2.add("four");
        System.out.println(list2); //output [three, four, five, six]
        // addAll(Collection <E>) append all element passed to end of method calls
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println("================");
        // removeAll(Collection <E>) remove all common element off 2 list
        list1.removeAll(list2);
       System.out.println(list1);
        System.out.println("=================");
        // addAll(int , Collection<e>) add all element of Collection at position
        // specified, may place at position index +1
        list1.addAll(2, list2);
        System.out.println(list1);
        System.out.println("==========");
        //  retain all elements of list1 and also of list2
        list1.retainAll(list2); 
        System.out.println("============");
        System.out.println(list1);
        // clear() 
        list1.clear();
        System.out.println(list1);
        
    }
}
