package OOPS;

// anonymousClass - the methods or implementation is done on the fly
// Original class properties will be constant while the property the particular object is changed
// Can be a class or interface
public class anonymousClass {
    public static void main(String[] args) {
        // anonymousClass using class
        anyClass obj = new anyClass() {
            @Override
            public int display() {
                return a * b; // Result will be Multiplication
            }
        };
        System.out.println(obj.display());
        anyClass obj1 = new anyClass();
        System.out.println(obj1.display()); // Result will be addition
        // anonymousClass using interfaces
        myInt intObj = new myInt() {
            @Override
            public int fun(int a, int b) {
                return a * b;
            }
        };
        System.out.println(intObj.fun(100, 39));
    }
}

// Class
class anyClass {
    public int a = 10;
    public int b = 20;

    public int display() {
        return a + b;
    }
}

// interface
interface myInt {
    abstract public int fun(int a, int b);
}