import java.util.Scanner;

public class A_HQ_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        if (isOutputYes(p)) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        sc.close();

    }

    private static boolean isOutputYes(String pString) {
        for (int i = 0; i < pString.length(); i++) {

            char ch = pString.charAt(i);
            if (ch == 'H' || ch == 'Q' || ch == '9') {
                return true;
            }

        }

        return false;
    }
}
