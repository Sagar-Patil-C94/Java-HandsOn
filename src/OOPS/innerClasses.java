package OOPS;

// classes can be a member of other classes...
// 4 Kinds : static inner class, Member inner class, Local Inner class
public class innerClasses {
    public static void main(String[] args) {
        // Creating objects of static inner class
        outerClass.statInClass obj = new outerClass.statInClass();
        System.out.println(obj.b);
        // Creating an instance of the inner class using the outer class object
        outerClass outObj = new outerClass();
        outerClass.memInnerClass obj1 = outObj.new memInnerClass();
        System.out.println(obj1.b);
        // calling method to use local inner class
        outObj.display();
    }
}

class outerClass {
    public int a = 10;

    // Static innerClass
    public static class statInClass {
        public int b = 20;

    }

    // Member inner class
    class memInnerClass {
        public int b = 20;
    }

    // Local Inner class
    public void display() {
        class lcInClass {
            public void greeting() {
                System.out.println("Hello World!!");
            }
        }
        lcInClass obj = new lcInClass();
        obj.greeting();
    }
}