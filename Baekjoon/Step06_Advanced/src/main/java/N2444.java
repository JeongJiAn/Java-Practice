import java.util.Scanner;

public class N2444 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] mat = new char[2 * n - 1][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - j - 1 <= 0) {
                    mat[i][j] = '*';
                    mat[i][2 * n - j - 2] = '*';
                } else {
                    mat[i][j] = ' ';
                    mat[i][2 * n - j - 2] = '\0';
                }
            }
            for (int j = 0; j < 2 * n - 1; j++) {
                mat[2 * n - i - 2][j] = mat[i][j];
            }
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (mat[i][j] != '\0') {
                    System.out.printf("%c", mat[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
