

package TreeSet;

import java.util.TreeSet;


public class TreSetExample {
    // Create atreeSet
    public static void main(String[] args) {
        
        
    TreeSet<Object> set = new TreeSet<Object>();
   
    set.add(20);
    set.add(80);
    set.add(70);
    set.add(20);
    set.add(40);
    set.add(50);
    set.add(null);
        System.out.println(set);
    // Kiểu dữ liệu phải trùng nhau , nếu không sẽ xảy ra lỗi classcastexxeption
//     set.add("aa");
//        System.out.println(set);
        try {
            set.add(null);
        } catch (Exception e) {
            System.out.println("khong add null value");
        }
    
}
}