import java.util.Scanner;

public class arrayHandsOn {
    public static void main(String[] args) {
        oneDArray();
        Scanner sc = new Scanner(System.in);
        multiArray(sc);
    }

    public static void oneDArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // accessing using foreach loop
        for (int a : array) {
            System.out.println(a);
        }
        String[] srtArray = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < srtArray.length; i++) {
            srtArray[i] = sc.nextLine();
        }
        for (String i : srtArray) {
            System.out.println(i);
        }
    }

    public static void multiArray(Scanner sc) {
        int[][] array = new int[2][2];
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array[i].length; i++) {
            for (int j : array[i]) {
                System.out.println(j);
            }
        }
    }
}
