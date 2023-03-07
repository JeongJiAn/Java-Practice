import java.util.Scanner;

public class N2566 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[9][9];
        int max = 0, max_y = 0, max_x = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int elem = scan.nextInt();
                mat[i][j] = elem;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    max_y = i;
                    max_x = j;
                }
            }
        }
        System.out.printf("%d\n%d %d\n", max, max_y + 1, max_x + 1);
    }
}
