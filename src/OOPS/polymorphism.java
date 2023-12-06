package OOPS;

// Polymorphism - Many Forms
// Can be achived by Method overloading (Compile Time Polymorphism) and Method Overridding (Runtime Polymorphism)
// Constructors, final and static methods can'nt be overridded
public class polymorphism {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(3.89, 9.99));
        System.out.println(sum(8.99, 10));
        B objB = new B();
        objB.func(); // Calling Inherited Method That is A
        C objC = new C();
        objC.func(); // Calling overrided Method That is C
    }

    // Methods Overloading
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(double a, int b) {
        return (int) a + b;
    }
}

class A {
    public void func() {
        System.out.println("Hello This Is A Class");
    }
}

class B extends A {
}

class C extends A {
    public void func() {
        System.out.println("Hello This Is C Class");
    }
}