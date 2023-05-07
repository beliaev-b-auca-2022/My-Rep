import java.util.*;

public class URI1553 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (n == 0 && k == 0) {
                break;
            }
            int[] freq = new int[101];
            for (int i = 0; i < n; i++) {
                int q = in.nextInt();
                freq[q]++;
            }
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (freq[i] >= k) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}