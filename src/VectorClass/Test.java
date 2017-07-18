

package VectorClass;

import java.util.ArrayList;
import java.util.Vector;


public class Test {
    public static void main(String[] args) {
        // Nếu chúng ta khởi tạo Vector không tham số, mỗi lần size vượt quá capicity
        // tự động tăng capacity thêm 10.
        Vector<String> obj = new Vector<String>();
        obj.add("1");
        System.out.println(obj.size());
        System.out.println(obj.capacity());// in put 10
        System.out.println("================");
        // Nếu chúng ta tạo 1 vector với capacity được chỉ định.
        // mỗi lần size tăng lên vượt quá capacity cho phép, capacity tự động tăng
        // gấp đôi capacity hiện có.
        Vector<String> vec = new Vector<String>(2);
        vec.add("1");
        vec.add("1");
        vec.add("1");
        System.out.println(vec.size());
        System.out.println(vec.capacity());
        System.out.println("=================");
        // Nếu chúng ta tạo Vector với 2 tham số, 1 là capacity, 2 là số lượng capacity
        // sẽ tăng lên mỗi khi size vượt quá capacity hiện tại.
        Vector<String> vector = new Vector<>(0,2);
        System.out.println(vector.capacity());
        vector.add("1");
        vector.add("2");
        System.out.println(vector.capacity());
         vector.add("3");
         vector.add("4");
         System.out.println(vector.capacity());
         System.out.println("==================");
         ArrayList<String> arr= new ArrayList<String>(1);
        arr.add("1");
        arr.add("2");
        arr.add("1");
    }
}
