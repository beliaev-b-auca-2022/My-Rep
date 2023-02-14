import java.util.Scanner;

public class URI1168 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0) {
            String s = in.next();
            int cnt = 0;
            for(int i = 0;i < s.length();i ++) {
                if(s.charAt(i) == '1') {
                    cnt += 2;
                }
                else if(s.charAt(i) == '7') {
                    cnt += 3;
                }
                else if(s.charAt(i) == '4') {
                    cnt += 4;
                }
                else if(s.charAt(i) == '2' || s.charAt(i) == '5' || s.charAt(i) == '3') {
                    cnt += 5;
                }
                else if(s.charAt(i) == '8') {
                    cnt += 7;
                }
                else {
                    cnt += 6;
                }
            }
            System.out.println(cnt + " leds");
            n--;
        }
    }
}
//com