import java.util.Scanner;

public class URI1031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n != 0) {
            int m = 1;
            while (true) {
                int x = 0;
                for (int i = 2; i <= n; i++) {
                    x = (x + m) % i;
                }
                if (x == 0) {
                    System.out.println(m);
                    break;
                }
                m++;
            }
            n = input.nextInt();
        }
    }
}