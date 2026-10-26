import java.util.Scanner;

public class Task_4 {
    public static void printMatrix(int n, int m) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(count);
                if (j < m - 1) {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        printMatrix(a, b);
    }
}
