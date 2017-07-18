

package Generic;
// Non-generic class can't extend Generic clas
// But , non-generic class can extend Generic when type of generic 
class BB{
int a; int b;
}
class AA<T>{
    public static void main(String[] args) {
        AA obj = new AA();
    }
}
public class ExtendGeneric extends AA<BB> {

    public ExtendGeneric() {
    }
}

class BBB<T> extends BB{}

//
class classVertical<T>{
    T t;
    
//
//    public classVertical(T t) {
//        this.t = t;
//    }
//    
//    }
}
class classCar extends classVertical{

//    public classCar(Integer t) {
//        super(t);
//    }
//    public static void main(String[] args) {
//        classCar obj = new classCar();
//        System.out.println(obj.t);
//    }
    public static void main(String[] args) {
        classCar obj = new classCar();
        System.out.println(obj.t);
    }
}
class GH<T extends Number>{}
class KH<T> extends GH<Number>{}