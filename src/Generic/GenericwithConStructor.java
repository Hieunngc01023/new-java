

package Generic;


public class GenericwithConStructor {
    int a;
    int b; 
  <T>  GenericwithConStructor(T t1,T t2, int a, int b){
      this.a =a; 
      this.b =b;     
      System.out.println(t1);
      System.out.println(t2);
  }

    public GenericwithConStructor() {
    }
    public static void main(String[] args) {
        GenericwithConStructor obj = new GenericwithConStructor("hieu","nguyen", 1, 2);
        System.out.println();
    }
    
}
