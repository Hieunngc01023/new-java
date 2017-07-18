

package HasMap;

import java.util.HashMap;
import javafx.scene.input.ClipboardContent;


public class LearnHasMap {
    public static void main(String[] args) {
        HashMap<Integer, String> ds = new HashMap<Integer, String>();
        // Thêm thông tin bằng phương thức put()
        
        ds.put(113, "Nguyen Van A");
        ds.put(114, "Nguyen thi Met");
        ds.put(115, "Nguyen thi tun");
        // lấy thông tin bằng phương thức get(), truyền vào khóa chính
        String nv = ds.get(114);
        System.out.println(nv);
        System.out.println("NHan vien toan bộ ");
        // Lấy ra tất cả giá trị
        for(String ten : ds.values())
        {
                System.out.println(ten);    
        }
        
        ds.remove(115);
        System.out.println("Sau khi xóa-------------------");
        for(String ten : ds.values())
            
        {
                System.out.println(ten);    
        }
        HashMap obj = new HashMap();
        
    }
}
