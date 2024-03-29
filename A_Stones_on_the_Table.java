
import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        System.out.println(minimumStonesToRemove(n, stones));
        scanner.close();
    }

    public static int minimumStonesToRemove(int n, String stones) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}