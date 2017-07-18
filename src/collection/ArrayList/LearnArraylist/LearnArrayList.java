

package collection.ArrayList.LearnArraylist;

import java.util.ArrayList;


public class LearnArrayList {
    public static void main(String[] args) {
        //Tại sao không phải đặt data type cho ArrayList
        // Đây là kiểu khai báo không tường minh.
        // Khi đưa và là chúng ta có thể đưa bất cứ kiểu dữ liệu nào cũng đươc.
        ArrayList ds = new ArrayList();
       ds.add("x");
       ds.add(new Integer(5));
       ds.add("9");
       ArrayList ds2 = new ArrayList();
       ds2.add(new Integer(3));
       // thêm và xóa đi các phần tử trong mảng.
       ArrayList ds3 = new ArrayList();
       ds3.add("An");
       ds3.add("BInh");
       ds3.add("Giai");
       ds3.add("Thoat");
       ds3.add(2, "add");
       ds3.remove("An");
       for(int i =0; i<ds3.size(); i++)
       {
           String x = ds3.get(i).toString();
           System.out.println(x);
           
       }
        System.out.println("===================");
        for(Object data :ds3)
        {
            System.out.println(data);
        }
        // Chỉ định rõ ràng 1 kiểu dữ liệu nào đấy.
        ArrayList<Double> ds4 = new ArrayList<Double>();
        for(int i =0; i<10; i++)
        {
            ds4.add(i*2.0);
        }
        ds4.remove(2*2.0);
        // Sửa phần tử tại vị trí được chỉ định.
        ds4.set(0, 1.2);
        for(double x: ds4)
        {
            System.out.println(x);
        }
        System.out.println("========");
        System.out.println(ds4.lastIndexOf(1.2));
    }
}
