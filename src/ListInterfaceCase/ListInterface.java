package ListInterfaceCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args) {

        // List Implemented Class - ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList1.add(i, "aaa");
        }
        // Adding elements
        arrayList.add("AAA");
        arrayList.add("BBB");
        arrayList.add("CCC");
        // Adding elements using index
        arrayList.add(1, "DDD");
        System.out.println(arrayList);
        // Accessing the collection elements
        System.out.println(arrayList.get(3));
        // Removing The Objects
        arrayList.remove("AAA");
        // Remove the element
        arrayList.remove(1);
        // Checking whether the element exist
        System.out.println(arrayList.contains("AAA"));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("DDD"));
        // Changeing
        arrayList.set(0, "AAA");

        // List Implemented Class - LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Sagar");
        list.addAll(arrayList);
        // Checking Index
        System.out.println(list.indexOf("Sagar"));
        // Same Methods as like arraylist class

        // List Implemented Class - Vector
        Vector<String> vector = new Vector<>();
        vector.add("Ivoyant");
        // Clearing the object
        vector.clear();


        // Stack Implement by vector interface
        Stack<String> strings = new Stack<>();
        strings.push("Sagar");
        strings.push("Patil");
        System.out.println(strings);
        // peek() method returns an object from the top of the stack.
        System.out.println(strings.peek());
        System.out.println(strings.pop());
        // search() method. It returns the position of the element from the top of the stack
        System.out.println(strings.search("Sagar"));
        // To check whether a stack is empty or not, we use the empty() method.
        System.out.println(strings.empty());
    }
}