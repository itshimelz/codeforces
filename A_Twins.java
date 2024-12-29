import java.util.Arrays;
import java.util.Scanner;

public class A_Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mySum = 0, count = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        int totalSum = Arrays.stream(a).sum();
        for (int coin : a) {
            mySum += coin;
            count++;
            if (mySum > (totalSum - mySum)) {
                break;
            }
        }
        System.out.print(count);
        sc.close();
    }
}