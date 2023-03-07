import java.util.Scanner;

public class N2563 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt() - 1, y = scan.nextInt() - 1;
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
