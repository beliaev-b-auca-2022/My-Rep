import java.util.Arrays;
import java.util.Scanner;

public class URI1171 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i == n-1 || nums[i] != nums[i+1]) {
                System.out.println(nums[i] + " aparece " + count + " vez(es)");
                count = 1;
            } else {
                count++;
            }
        }
    }
}
