package OOPS;

// Inheritance - inheriting/aquire the features (attributes and methods) from one class to another class
// Information can be managed and organized in a hierarchical order
// In Java - Multilevel inheritance can be achived but Multiple inheritance can not be achived because a class can not extends more than one class which cause diamond problem
public class inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sagar", 20020, "Davanagere", 1, 2992, "CSE");
        e1.getInfo();
    }
}

// Base Class or Parent Class or Super Class
class Person {
    public String name;
    protected long phoneNum;
    public String addrs;
    private int id;

    public Person(String name, long phoneNum, String addrs, int id) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.addrs = addrs;
    }
}

// Child Class or Sub Class
class Employee extends Person {
    public long empID;
    public String dept;

    public Employee(String name, long phoneNum, String addrs, int id, long empID, String dept) {
        // constructors are not the member methods hence they are not inherited
        super(name, phoneNum, addrs, id);
        this.empID = empID;
        this.dept = dept;
    }

    public void getInfo() {
        System.out.println(super.name); // can use super keyword in order to access superclass attributes or methods
        System.out.println(phoneNum); // Protected Members can be accessed with sub-class
        System.out.println(addrs);
        //System.out.println(id); -  Private Members can'nt be accessed with sub-class
        System.out.println(empID);
        System.out.println(dept);
    }
}