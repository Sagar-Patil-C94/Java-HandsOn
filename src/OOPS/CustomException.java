package OOPS;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] username = name.toCharArray();
        for (char ch : username) {
            try {
                if (ch == ' ') throw new UserNameException("Username Cannot Contain Space");
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println(ch);
            }
        }
    }
}

class UserNameException extends RuntimeException {
    public UserNameException(String message) {
        super(message);
    }
}