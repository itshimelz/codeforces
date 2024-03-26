import java.util.Scanner;

public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        String s;

        for (int i = 0; i < n; i++) {
            s = sc.next();
            char ch = s.charAt(0);
            if (ch == 'T') {
                sum = sum + 4;
            } else if (ch == 'C') {
                sum = sum + 6;
            } else if (ch == 'O') {
                sum = sum + 8;
            } else if (ch == 'D') {
                sum = sum + 12;
            } else
                sum = sum + 20;
        }

        System.out.println(sum);
        sc.close();

    }
}