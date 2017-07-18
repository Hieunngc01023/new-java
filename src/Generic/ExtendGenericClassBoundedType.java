

package Generic;


public class ExtendGenericClassBoundedType<T extends Number> {
    
}
// can't extend generic class with same Bounded type
//class classA extends ExtendGenericClassBoundedType<T extends Number>{}

class classA extends ExtendGenericClassBoundedType<Number>{}
class classB extends ExtendGenericClassBoundedType<Double>{}

