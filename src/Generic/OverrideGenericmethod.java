

package Generic;


public class OverrideGenericmethod {
    <T> void genericMethod(T t)
    {
        System.out.println(t);
    }
}
class Divired extends OverrideGenericmethod{

    @Override
    <D> void genericMethod(D t) {
        System.out.println(t);
    }
    public static void main(String[] args) {
        new OverrideGenericmethod().genericMethod("I am Sut");
        new Divired().genericMethod("ahehe");
        System.out.println("<");
    }
    
}

