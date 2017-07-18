

package Generic;


public class BoundedType<T extends Number> {
    T t;
    public BoundedType(T t)
    {
        this.t =t;
    }
    public T getT(){
         return t;
    }
    public <T extends Number> void method(T t1){
        System.out.println(t1);
    }
           
}
class Generics{
        public static void main(String[] args) {
        BoundedType<Number> gen1 = new BoundedType<Number>(10);
        BoundedType<Integer> gen2 = new BoundedType<Integer>(15);
//        BoundedType<String> gen3 = new BoundedType<String>("fasd");
       // Lỗi bởi vì giới hạn chỉ dữ liệu kiêu số.
        gen1.method(10);
     
    }
}
