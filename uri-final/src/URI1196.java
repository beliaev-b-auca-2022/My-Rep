import java.util.Scanner;

public class URI1196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        String line;
        int i, pos;
        line = in.nextLine();
        for (i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else {
                pos = keyboard.indexOf(Character.toLowerCase(c)) - 1;
                System.out.print(Character.toUpperCase(keyboard.charAt(pos)));
            }
        }
        System.out.println();
    }
}