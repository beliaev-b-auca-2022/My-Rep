import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI1104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            Set<Integer> alice = new HashSet<>();
            Set<Integer> k = new HashSet<>();
            Set<Integer> betty = new HashSet<>();
            for (int i = 0; i < A; i++) {
                int a = in.nextInt();
                alice.add(a);
                k.add(a);
            }
            for (int i = 0; i < B; i++) {
                betty.add(in.nextInt());
            }
            alice.removeAll(betty);
            betty.removeAll(k);
            System.out.println(Math.min(alice.size(), betty.size()));
        }
    }
}
