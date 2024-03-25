import java.util.Scanner;

public class A_The_Rank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] scores = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }

        int thomasTotalScore = scores[0][0] + scores[0][1] + scores[0][2] + scores[0][3];

        int rank = 1;

        for (int i = 1; i < n; i++) {
            int totalScore = scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3];
            if (totalScore > thomasTotalScore) {
                rank++;
            }
        }

        System.out.println(rank);
        scanner.close();
    }
}