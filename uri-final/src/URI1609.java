import java.util.*;

public class URI1609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int sheep = in.nextInt();
                set.add(sheep);
            }
            System.out.println(set.size());
        }
    }
}