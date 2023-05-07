import java.util.Scanner;

public class URI1285 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int count = 0;
            for (int i = n; i <= m; i++) {
                if (hasRepeatedDigit(i) == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
    public static boolean hasRepeatedDigit(int n) {
        boolean[] digits = new boolean[10];
        while (n > 0) {
            int digit = n % 10;
            if (digits[digit]) {
                return true;
            }
            digits[digit] = true;
            n /= 10;
        }
        return false;
    }
}