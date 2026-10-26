import java.util.Scanner;

public class Task_2 {
    public static void printHollowSquare(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n-2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        printHollowSquare(a);
    }
}
