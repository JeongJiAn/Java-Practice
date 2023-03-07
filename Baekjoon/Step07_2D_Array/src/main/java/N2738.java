import java.util.Scanner;

public class N2738 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[][] mat1 = new int[n][m];
        int[][] mat2 = new int[n][m];
        int[][] mat3 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int elem = scan.nextInt();
                mat1[i][j] = elem;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int elem = scan.nextInt();
                mat2[i][j] = elem;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", mat3[i][j]);
            }
            System.out.println("");
        }
    }
}
