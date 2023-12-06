package OOPS;

public class methodTypes {
    public static void main(String[] args) {
        Demo obj = new Demo(10, 30);
        // valueType method calling
        System.out.println(sum(obj.a, obj.b));
        // Doesn't change the original values
        System.out.println(obj.a);
        System.out.println(obj.b);
        // reference Type Method calling
        obj.clearAttributes(obj);
        // change the values
        System.out.println(obj.a);
        System.out.println(obj.b);
        // Accessing Static attributes or methods - By Class
        System.out.println(Demo.count);
        // Accessing Static attributes or methods - By Instance of Class
        System.out.println(obj.count);
        // Trying to change the final variable will cause an compile time error
        //Demo.PI = 90.99;
        // Demo on Math Class - Inbuilt class in java to handle some maths operations
        int a = -2, b = 2;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.ceil(9.39)); // 9.39 to 10 - Up
        System.out.println(Math.floor(9.39)); // 9.39 to 10 - Up
        System.out.println(Math.pow(a, b));
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}

class Demo {
    // Static - the attributes or methods prefixed will be belong to the class not to the instance
    static int count = 30;
    // final - The attributes which can'nt be modified once defined
    static final double PI = 3.14;
    public int a;
    public int b;

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void clearAttributes(Demo obj) {
        obj.a = 0;
        obj.b = 0;
    }
}
