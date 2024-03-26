import java.util.Scanner;

public class A_Sum {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (maxNum(a, b, c) == a) {
                if (a == b + c) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
            } else if (maxNum(a, b, c) == b) {
                if (b == a + c) {
                    System.out.println("YES");
                } else
                    System.out.println("NO");
            } else if (c == a + b) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

    static int maxNum(int x, int y, int z) {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
}