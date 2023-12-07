package OOPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileCase {
    public static void main(String[] agrs) throws FileNotFoundException {
        // Creating file object
        File fileObj = new File("/Users/sagar/Java Projects/Java HandsOn/Java/src/OOPS/1.txt");
        // Checking whether the file exists or not
        if (!fileObj.exists()) {
            System.out.println("File Does not exists");
        } else {
            Scanner scFile = new Scanner(fileObj);
            try {
                while (scFile.hasNextLine()) {
                    System.out.println(scFile.nextLine());
                }
                scFile.close();
            } catch (Exception e) {
                scFile.close();
            }
        }
        // Creating file
        try {
            Formatter fileObj2 = new Formatter("2.txt");
            fileObj2.format("%s", "Hello world\n");
            fileObj2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        File fileObj3 = new File("2.txt");
        try {
            Scanner scfile = new Scanner(fileObj3);
            while (scfile.hasNext()) {
                System.out.println(scfile.next());
            }
        } catch (Exception e) {
        }
    }
}