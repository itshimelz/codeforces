import java.util.Scanner;

public class A_Two_Elevators {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (b < c) {
                b = c + (c - b);
            } else if (b > c) {
                b = c + (b - c);
            }

            if (a < b) {
                System.out.println(1);
            } else if (a > b) {
                System.out.println(2);
            } else
                System.out.println(3);
        }
        sc.close();
    }
}