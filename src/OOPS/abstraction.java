package OOPS;

// Abstraction - Hidding implementation things and exposing essential things
// Two ways : 1. By extending abstract class - class which contains attributes and some abstract methods, these methods must and should implement in the class which extends it.
// 2. By implementing interfaces - Interfaces consists of set of abstract methods, each and every methods in the interface must be implemented in the class which implements that interface.
public class abstraction {
    public static void main(String[] args) {
        exClass obj = new exClass(300);
        obj.add(10);
        calculator calObj = new calculator();
        System.out.println(calObj.sum(500, 300));
        System.out.println(calObj.diff(500, 300));
        System.out.println(calObj.mul(500, 300));
        System.out.println(calObj.div(500, 300));
        System.out.println(calObj.rem(500, 300));
    }
}

// Approch 1 : By Abstract Class
abstract class abClass {
    public int var1;
    // Abstract classes can contain constructors

    public abClass(int var1) {
        this.var1 = var1;
    }

    public void greeting() {
        System.out.println("Hello!");
    }

    abstract public void add(int x);
}

class exClass extends abClass {
    public exClass(int var1) {
        super(var1);
    }

    @Override
    public void add(int x) {
        System.out.println(x + var1);
    }
}

// Approch 2 : By Implementing Interfaces
interface inClass {
    // Can't Contain constructors - Because interfaces can'nt be instantiated
    abstract public int sum(int a, int b);

    abstract public int diff(int a, int b);

    abstract public int mul(int a, int b);

    abstract public int div(int a, int b);
}

// Interface can extend any other interfaces
interface calClass extends inClass {
    abstract public int rem(int a, int b);
}

// Class can implement any number of interfaces
class calculator implements inClass, calClass {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public int rem(int a, int b) {
        return a % b;
    }
}