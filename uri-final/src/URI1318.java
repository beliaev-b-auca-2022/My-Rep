import java.util.Arrays;
import java.util.Scanner;

public class URI1318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] tickets = new int[m];
            for (int i = 0; i < m; i++) {
                tickets[i] = in.nextInt();
            }
            Arrays.sort(tickets);
            int count = 0;
            int[] v = new int[n + 1];
            for (int i = 0; i < m - 1; i++) {
                if (tickets[i] == tickets[i + 1] && v[tickets[i]] == 0) {
                    count++;
                    v[tickets[i]] ++;
                }
            }
            System.out.println(count);
        }
    }
}
