public class Task_9 {
        public static boolean isArmstrong(int n) {
            int original = n;
            int digits = 0;
            int temp = n;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            int sum = 0;
            temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            return sum == original;
        }

        public static void main(String[] args) {
            boolean first = true;
            for (int i = 100; i <= 999; i++) {
                if (isArmstrong(i)) {
                    if (!first) {
                        System.out.print(" ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
            System.out.println();
        }
    }
