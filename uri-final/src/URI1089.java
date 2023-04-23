import java.util.Scanner;

public class URI1089 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }
            int count = 0;
            for (int i = 1; i < n - 1; i++) {
                if ((h[i] > h[i - 1] && h[i] > h[i + 1]) || (h[i] < h[i - 1] && h[i] < h[i + 1])) {
                    count++;
                }
            }
            if ((h[0] > h[1] && h[0] > h[n - 1]) || (h[0] < h[1] && h[0] < h[n - 1])) {
                count++;
            }
            if ((h[n - 1] > h[0] && h[n - 1] > h[n - 2]) || (h[n - 1] < h[0] && h[n - 1] < h[n - 2])) {
                count++;
            }
            System.out.println(count);
        }
    }
}