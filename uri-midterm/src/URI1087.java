import java.util.Scanner;

public class URI1087 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int x , y , x1, y1;
            x = in.nextInt();
            y = in.nextInt();
            x1 = in.nextInt();
            y1 = in.nextInt();
            if(x == 0) {
                break;
            }
            int res = 0;
            if(x == x1 && y == y1) {
                res = 0;
            }
            else if((x == x1 || y == y1) || (Math.abs(x1 - x) == Math.abs(y1 - y))) {
                res = 1;
            }
            else {
                res = 2;
            }
            System.out.println(res);
        }
    }
}
