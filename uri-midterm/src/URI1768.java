import java.util.Scanner;

public class URI1768 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            for(int i = 1;i <= n;i += 2) {
                for(int j = 0;j < (n / 2 + 1) - (i / 2 + 1);j ++) {
                    System.out.print(" ");
                }
                for(int j = 0;j < i;j ++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int j = 0;j < (n / 2 + 1) - 1;j ++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
            for(int j = 0;j < (n / 2 + 1) - 2;j ++) {
                System.out.print(" ");
            }
            System.out.print("***\n");
        }
    }
}
