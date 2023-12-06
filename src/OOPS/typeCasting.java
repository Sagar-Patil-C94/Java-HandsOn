package OOPS;

// TypeCasting - Converting one datatype to other datatype
// Implict type casting - By default java handles this (int->double)
// Explict type casting - Must be implemented, like (double->int,int->String)
// In Case Of OOPs/Classes we have 2 casting namely : Upcasting(Making subclass instance as a base class instance) and DownCasting(Making base class instance as a subclass instance)
public class typeCasting {
    public static void main(String[] args) {
        // Implict type casting ( To short datatype to larger datatype)
        int var = 20; // 4 Bytes
        double var1 = var;// 8 Bytes
        long var2 = var;// 8 Bytes
        float var3 = var;// 4 Bytes
        System.out.println(var);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        // Explict typeCasting ( larger datatype to shorter type)
        double a = 100.33;
        int b = (int) a;
        System.out.println(b);
        // String str = (String) a; - Compilation error: incompatible types
        castA aObj = new castA();
        System.out.println(aObj.a);
        castB bObj = new castB();
        System.out.println(bObj.a);
        System.out.println(bObj.b);
        // Upcasting - Upcasting refers to the process of casting an object to its superclass type.
        castA upAobj = bObj; // Implicit
        System.out.println(upAobj.a);
        // Downcasting - Downcasting is the opposite of upcasting. It involves casting an object from a superclass type to a subclass type.
        // explicit casting and may lead to ClassCastException if not done carefully. Downcasting is riskier than upcasting because you are moving from a more general type to a more specific type.
        if (aObj instanceof castB) {
            castB objB = (castB) aObj; // Downcasting only if compatible
            // Now you can use objB safely
        }
        try {
            castB downObj = (castB) aObj;
            System.out.println(downObj.a);
            System.out.println(downObj.b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class castA {
    public int a = 10;
}

class castB extends castA {
    public int b = 10;
}