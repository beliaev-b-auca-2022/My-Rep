import java.util.Scanner;

public class URI1574 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int pos = 0;
            String[] instructions = new String[n];
            for (int i = 0; i < n; i++) {
                instructions[i] = in.next();
                if (instructions[i].equals("LEFT")) {
                    pos--;
                } else if (instructions[i].equals("RIGHT")) {
                    pos++;
                } else {
                    int index = Integer.parseInt(instructions[i].split(" ")[2]) - 1;
                    instructions[i] = instructions[index];
                    i--;
                }
            }
            System.out.println(pos);
        }
    }

}