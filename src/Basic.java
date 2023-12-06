/*
Java Development Kit (JDK) - Compile to byte code
Java Virtual Machine (JVM) - Virtual layer on the System to run java programs
Java RunTime Environment (JRE) - Validate the byte code and provide libraries
*/

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        dataTypes();
        inputFun();
        conditional();
        loops();
    }

    public static void dataTypes() {
        String name = "Sagar";
        System.out.println("Hello " + name);
        // char, Size 1 Byte
        char myChar = 'S';
        System.out.println(myChar);
        // cause error if value is not between -128 to 127, Size - Not precisely defined (1byte)
        byte byNum = 127;
        System.out.println(byNum);
        // cause error if value is not between -32768 to 32767, Size - 2byte
        short shortNum = 32767;
        System.out.println(shortNum);
        // cause error if value is not between -2^31 to 2^31-1, Size - 4byte
        int num = 20;
        System.out.println(num);
        // cause error if value is not between -2^63 to 2^63-1, Size - 8byte
        long longNum = 300030030;
        System.out.println(longNum);
        //We need to f when we need proper float type, Size - 4byte
        float num1 = 20.33f;
        System.out.println(num1);
        // Gives - 30.45, Size - 8byte
        double num2 = 30.45;
        System.out.println(num2);
        // Precision - 30.45000....
        double num3 = 30.45f;
        System.out.println(num3);
        // Math Operations +,-,*,/,*
        int a = 23;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static void inputFun() {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        byte byNum = sc.nextByte();
        short shortNum = sc.nextShort();
        int num = sc.nextInt();
        long longNum = sc.nextLong();
        float floatNum = sc.nextFloat();
        double doubleNum = sc.nextDouble();
        // Other methods are hasNext(), hasNextInt(), hasNextByte()...
        // which are used to avoid the type conflicts
        System.out.println(str);
    }

    public static void conditional() {
        int a = 10;
        int b = 20;
        // if else and elif conditional statement
        // Comparison operations - <, >, <=, >=, !=, ==
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println("Equals");
        } else {
            System.out.println(b);
        }
        // Switch - multiple conditions
        switch (a) {
            case 10:
                System.out.println(a);
                break;
            case 20:
                System.out.println(b);
                break;
            default:
                System.out.println("Invalid");
        }
        // break is necessary if not mentioned the all the cases will get's executed
        // bi-conditional statement condition?TrueValue:FalseValue
        int c = a > b ? a : b;
        System.out.println(c);
    }

    public static void loops() {
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // do-while loop
        do {
            System.out.println(i);
            i++;
        } while (i < 15);
    }
}