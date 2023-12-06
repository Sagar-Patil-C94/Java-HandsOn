package OOPS;

class Student {
    // Attributes - can be public, private, protected, default(without specifying)
    public String name;
    protected String USN;

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    private String addrs;
    long phno;

    // Constructor without parameters
    Student() {
        System.out.println("Object Created Without Initialization");
    }

    // Constructor with parameters
    Student(String usn, String Name, String address, long phone) {
        USN = usn;
        name = Name;
        addrs = address;
        phno = phone;
    }

    // Methods - can be public, private, protected, default(without specifying)
    public void display() {
        System.out.println(name);
        System.out.println(USN);
        System.out.println(phno);
        System.out.println(addrs);
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        // It prints Object Created Without Initialization
        Student obj1 = new Student();
        Student obj2 = new Student("4GM20CS083", "SAGAR PATIL", "DAVANAGERE", 300030030);
        obj2.display();
        // Accessing public attributes - accessible by any class and by any package
        System.out.println(obj2.name);
        // Accessing default attributes- accessible by any class and within same package
        System.out.println(obj2.phno);
        // Accessing protected attributes - accessed within the same class, subclasses, and classes in the same package
        System.out.println(obj2.USN);
        // Accessing private attributes - give compile time error because only accessible within the class
        //System.out.println(obj2.addrs);
        // In private case they are accessed and modified by getters and setters
        System.out.println(obj2.getAddrs());
    }
}
