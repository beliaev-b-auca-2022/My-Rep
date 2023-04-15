import java.util.Scanner;

public class URI1218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            int[] count = new int[2];
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                int shoeSize = lineScanner.nextInt();
                char gender = lineScanner.next().charAt(0);
                count[gender == 'F' ? 0 : 1] += (shoeSize == n) ? 1 : 0;
            }
            System.out.println();
            System.out.println("Caso " + testCase + ":");
            System.out.println("Pares Iguais: " + (count[1]+count[0]));
            System.out.println("F: " + count[0]);
            System.out.println("M: " + count[1]);
            System.out.println();
            testCase++;
        }
    }
}