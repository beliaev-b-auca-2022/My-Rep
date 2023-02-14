import java.util.Scanner;

public class URI1253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0) {
            String s = in.next();
            int x = in.nextInt();
            String ans = "";
            for(int i = 0;i < s.length();i ++) {
                int l = s.charAt(i);
                l -= x;
                if(l < 65) {
                    int k = 65 - l - 1;
                    l = 90 - k;
                }
                char c = (char) l;
                ans = ans + c;
            }
            System.out.println(ans);
            n--;
        }
    }
}
