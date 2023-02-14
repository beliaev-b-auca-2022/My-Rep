import java.util.Scanner;

public class URI1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0) {
            String a = in.next() , b = in.next();
            String ans = "";
            int m = a.length();
            if(a.length() > b.length()) {
                m = b.length();
            }
            for(int i = 0;i < m;i ++) {
                ans += a.charAt(i);
                ans += b.charAt(i);
            }
            String s = a;
            if(a.length() > b.length()) {
                a = b;
                b = s;
            }
            for(int i = a.length();i < b.length();i ++) {
                ans += b.charAt(i);
            }
            System.out.println(ans);
            n--;
        }
    }
}
