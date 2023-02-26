import java.util.Scanner;

public class URI1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();
        for (int i = 1; i <= nc; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = josephus(n, k);
            System.out.println("Case " + i + ": " + ans);
        }
    }
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (josephus(n-1, k) + k-1) % n + 1;
    }
}
