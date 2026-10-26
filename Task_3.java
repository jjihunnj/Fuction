import java.util.Scanner;

public class Task_3 {
    public static void printInvertedPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int o = in.nextInt();
        printInvertedPyramid(o);

    }

}
