import java.util.Scanner;

public class Task_1 {
    public static void printStrip(int a, char b) {
        for (int i = 0; i <= a; i++) {
            System.out.print(b);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        printStrip(a, '#');
    }
}