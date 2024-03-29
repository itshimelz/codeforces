import java.util.Scanner;

public class A_Hexadecimal_s_theorem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;

        for (int i = 0; i <= n; i++) {
            if (i == calFibonacci(n - 4))
                a = i;
            else if (i == calFibonacci(n - 3))
                b = i;
            else if (i == calFibonacci(n - 1))
                c = i;
        }

        if (a + b + c == n && n > 3) {
            System.out.print(a + " " + b + " " + c);
        } else {
            System.out.println("I'm too stupid to solve this problem");
        }

        sc.close();
    }

    static int calFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return calFibonacci(n - 1) + calFibonacci(n - 2);
    }
}