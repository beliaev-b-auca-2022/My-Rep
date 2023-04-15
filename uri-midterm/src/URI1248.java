import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI1248 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int t = 0; t < n; t++) {
            String diet = in.nextLine();
            String breakfast = in.nextLine();
            String lunch = in.nextLine();
            Map<Character, Integer> dietMap = new HashMap<>();
            Map<Character, Integer> consumedMap = new HashMap<>();
            for (char c : diet.toCharArray()) {
                dietMap.put(c, dietMap.getOrDefault(c, 0) + 1);
            }
            for (char c : breakfast.toCharArray()) {
                if (dietMap.containsKey(c)) {
                    consumedMap.put(c, consumedMap.getOrDefault(c, 0) + 1);
                }
            }
            for (char c : lunch.toCharArray()) {
                if (dietMap.containsKey(c)) {
                    consumedMap.put(c, consumedMap.getOrDefault(c, 0) + 1);
                }
            }
            boolean cheated = false;
            StringBuilder dinner = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : dietMap.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();
                int consumedCount = consumedMap.getOrDefault(c, 0);
                if (consumedCount == 0 || consumedCount > count) {
                    cheated = true;
                    break;
                }
                for (int i = 0; i < count - consumedCount; i++) {
                    dinner.append(c);
                }
            }
            if (cheated) {
                System.out.println("CHEATER");
            } else {
                System.out.println(dinner.toString());
            }
        }
    }
}
