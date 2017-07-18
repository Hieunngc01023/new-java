

package ListIterotor;

import java.util.ArrayList;
import java.util.ListIterator;
// ListIterator Dùng để duyệt 1 danh sách,  Chỉ sử dụng được với List.
// Hộ trợ thêm các phương thức.
// Có thể duyệt ngược list.

public class ExampleListIterator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hieu");
        arr.add("nguyen ");
        arr.add("ngoc");
        arr.add("chelsea");
        ListIterator<String> li = arr.listIterator();
        while(li.hasNext())
            System.out.println(li.next());
        System.out.println("========="); 
        while(li.hasPrevious()){
            System.out.println("Vi tri index:"+li.previousIndex()+" " +li.previous());
          
        }
        System.out.println("====================");
        System.out.println(arr);
        
    }
}
