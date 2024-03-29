import java.util.Scanner;
public class A_Domino_piling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0, d;
        m = sc.nextInt();
        n = sc.nextInt();
        d = (m * n) / 2;
        System.out.println(d);
        sc.close();
    }
}