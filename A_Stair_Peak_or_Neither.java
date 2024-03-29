import java.util.Scanner;

public class A_Stair_Peak_or_Neither {

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a < b && b < c) {
                System.out.println("STAIR");
            } else if (a < b && b > c) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
        sc.close();
    }
}