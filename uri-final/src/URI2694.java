import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URI2694 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            int sum = 0;
            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }
            System.out.println(sum);
        }
    }
}