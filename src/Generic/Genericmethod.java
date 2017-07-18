

package Generic;


public class Genericmethod {
  public static  <T> int genericMethod(T t1, T t2)
    {
         t2 = t1;
        System.out.println(t2);
    return 0;
    }
}
class D{
    public static void main(String[] args) {
        Genericmethod.genericMethod("hahahah","hieu");
//        Genericmethod.genericMethod(15);
//        Genericmethod.genericMethod('d');
        
    }
}
