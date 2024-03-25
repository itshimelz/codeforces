import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(bitPlus(n, x, sc));
        sc.close();
    }

    private static int bitPlus(int n, int x, Scanner sc) {
        for (int i = 0; i < n; i++) {
            String st = sc.nextLine();
            if (st.charAt(0) == '+' || st.charAt(2) == '+') {
                x++;
            } else if (st.charAt(0) == '-' || st.charAt(2) == '-') {
                x--;
            }
        }
        return x;
    }
}
