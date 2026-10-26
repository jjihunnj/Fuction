import java.util.Scanner;

public class Task_8 {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String result = "";
        while (n > 0) {
            result = (n % 2) + result;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Binary = " + decimalToBinary(n));
    }
}
