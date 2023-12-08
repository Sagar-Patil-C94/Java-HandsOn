package OOPS;

// Exception Handling In Java = try, catch, throw, throws, finally

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End Of The Code");
        }
//        func();
        System.out.println("End The Program!!");
        customExceptionfunc();
    }

    // Code that may throw CustomException
    public static void func() throws ArithmeticException {
        int a = 10, b = 0;
        if (b == 0) {
            throw new ArithmeticException("Divide By Zero!!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void customExceptionfunc() {
        int a = 10, b = 0;
        if (b == 0) {
            throw new CustomException("Divide By Zero!!");
        } else {
            System.out.println(a / b);
        }
    }
}
