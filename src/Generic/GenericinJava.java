

package Generic;
// Bài toán mô tả việc tạo một Generic như thế nào.
// Chúng ta có thể tạo một đối tượng với 1 kiểu dữ liệu chỉ định.

public class GenericinJava {
    public static void main(String[] args) {
        GenericClass<String> gen1 = new GenericClass<String>("It must be string");
        gen1.setT("Value Changed"); 
        String s = gen1.getT();
//        gen1.setT(new Integer(123)); // Bao loi boi vi
//        // wrapper class khong phai kieu du lieu String
//        gen1.setT(new Double(12.23));
        // Bao loi boivi khong the ep kieu duoc
        // Nếu khởi tạo đối tượng mà không chỉ định rõ ràng type , thì nó sẽ xem type đó như là kiểu object có thể chứa tất cả type.
        GenericClass obj1 = new GenericClass("afsadf");
        obj1.setT(15);
        obj1.setT('v');
        
        GenericClass<Integer> obj = new GenericClass<Integer>(5);
        obj.setT(10);
        System.out.println(obj.t);
        System.out.println(obj1.t);
        
//        gen1 =obj;// Không thể gán 2 object có kiểu dữ liệu khác nhau.
    }
    
}
class GenericClass<T>
{
    T t;
   

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
   
}