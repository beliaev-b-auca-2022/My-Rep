import java.util.Scanner;

public class URI1743 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i = 0;i < 5;i ++) {
            a[i] = in.nextInt();
        }
        for(int i = 0;i < 5;i ++) {
            b[i] = in.nextInt();
        }
        boolean flag = true;
        for(int i = 0;i < 5;i ++) {
            if(a[i] == b[i]) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
