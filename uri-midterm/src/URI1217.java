import java.util.Scanner;

public class URI1217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double res = 0 , m = 0;
        for (int i = 0; i < n; i++) {
            double a = in.nextDouble();
            in.nextLine();
            String s = in.nextLine();
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isWhitespace(s.charAt(j))) cnt++;
            }
            System.out.printf("day %d: %d kg\n", i + 1, cnt + 1);
            res += cnt + 1;
            m += a;
        }
        System.out.printf("%.2f kg by day\n", res / n);
        System.out.printf("R$ %.2f by day\n", m / n);
    }
}
