import java.util.Scanner;

public class URI1329 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            }
            int m = 0 , d = 0;
            for(int i = 0;i < n;i ++) {
                int a = in.nextInt();
                if(a == 1) {
                    d ++;
                }
                else {
                    m ++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times\n",m , d);
        }
    }
}
