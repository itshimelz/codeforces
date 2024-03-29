import java.util.Scanner;

public class C_Clock_Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String inter = sc.nextLine();

            int h = Integer.parseInt(inter.substring(0, 2));
            int m = Integer.parseInt(inter.substring(3, 5));

            String period = "AM";

            if (h >= 12) {
                period = "PM";
                if (h > 12) {
                    h = h - 12;
                }
            }

            if (h == 0) {
                h = 12;
            }

            String hh = String.format("%02d", h);
            String mm = String.format("%02d", m);

            String formattedTime = hh + ":" + mm + " " + period;
            System.out.println(formattedTime);
        }
        sc.close();
    }
}
