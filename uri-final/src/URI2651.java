import java.util.Scanner;

public class URI2651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        if (name.toLowerCase().contains("zelda")) {
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}
