import java.util.Scanner;

public class URI1632 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String password = in.next();
            long variations = 1;
            for (char c : password.toCharArray()) {
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 's' || c == 'S') {
                    variations *= 3;
                } else {
                    variations *= 2;
                }
            }
            System.out.println(variations);
        }
    }
}
