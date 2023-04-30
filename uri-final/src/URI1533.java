import java.util.Scanner;

public class URI1533 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        while(n != 0) {
            n = in.nextInt();
            if(n == 0) {
                break;
            }
            int mx = 0, lmx = 0, mxi = 0,lmxi = 0;
            int a = 0;
            int v[] = new int[n];
            for(int i = 0;i < n;i ++) {
                a = in.nextInt();
                v[i] = a;
                if(mx < a) {
                    mx = a;
                    mxi = i;
                }
            }
            for(int i = 0;i < n;i ++) {
                if(v[i] < mx && lmx < v[i]) {
                    lmx = v[i];
                    lmxi = i;
                }
            }
            System.out.println(lmxi+ 1);
        }
    }
}
