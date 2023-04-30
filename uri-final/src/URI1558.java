import java.util.Scanner;

public class URI1558 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            boolean found = false;
            for (int i = 0; i * i <= n; i++) {
                int j = (int) Math.sqrt(n - i * i);
                if (i * i + j * j == n) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}
