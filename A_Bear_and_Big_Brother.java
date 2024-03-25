import java.util.Scanner;

public class A_Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(year(a, b));
        sc.close();
    }

    public static int year(int a, int b) {

        int i = 0;
        while (a <= b) {
            a = a * 3;
            b = b * 2;
            i++;
        }
        return i;
    }
}