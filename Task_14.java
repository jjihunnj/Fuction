import java.util.Scanner;

public class Task_14 {
    public static int transformDigits(int n) {
        int result = 0;
        int multiplier = 1;
        while (n > 0) {
            int digit = n % 10;
            int newDigit = (digit % 2 == 0) ? digit + 1 : digit - 1;
            result += newDigit * multiplier;
            multiplier *= 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(transformDigits(n));
    }
}
