import java.util.Scanner;

public class URI1305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String num = in.next();
            String cutoff = in.next();
            double number = Double.parseDouble(num);
            double cutoffNum = Double.parseDouble(cutoff);
            int roundedNum = (int) Math.floor(number);
            if (number - Math.floor(number) >= cutoffNum) {
                roundedNum++;
            }
            System.out.println(roundedNum);
        }
    }
}