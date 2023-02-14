import java.util.Scanner;

public class URI1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0) {
            String s = in.nextLine();
            s = reverseString(s);
            String ans = "";
            for(int i = 0;i < s.length();i ++) {
                int l = s.charAt(i);
                l += 3;
                char c = (char) l;
                ans += c;
            }
            System.out.println(ans);
            n--;
        }
    }
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
//com


