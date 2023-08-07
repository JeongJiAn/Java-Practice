import java.util.Scanner;

public class N1018 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt(), min_repaint = 64;
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = scan.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        for (int n = 0; n <= N - 8; n++) {
            for (int m = 0; m <= M - 8; m++) {
                char first = 'B', second = 'W';
                int repaint = 0;
                for (int i = n; i < n + 8; i++) {
                    for (int j = m; j < m + 8; j++) {
                        if ((i - n) % 2 == 0) {
                            if ((j - m) % 2 == 0) {
                                if (board[i][j] != first) {
                                    repaint++;
                                }
                            } else {
                                if (board[i][j] != second) {
                                    repaint++;
                                }
                            }
                        } else {
                            if ((j - m) % 2 == 0) {
                                if (board[i][j] != second) {
                                    repaint++;
                                }
                            } else {
                                if (board[i][j] != first) {
                                    repaint++;
                                }
                            }
                        }
                    }
                }
                if (repaint < min_repaint) {
                    min_repaint = repaint;
                }
                first = 'W';
                second = 'B';
                repaint = 0;
                for (int i = n; i < n + 8; i++) {
                    for (int j = m; j < m + 8; j++) {
                        if ((i - n) % 2 == 0) {
                            if ((j - m) % 2 == 0) {
                                if (board[i][j] != first) {
                                    repaint++;
                                }
                            } else {
                                if (board[i][j] != second) {
                                    repaint++;
                                }
                            }
                        } else {
                            if ((j - m) % 2 == 0) {
                                if (board[i][j] != second) {
                                    repaint++;
                                }
                            } else {
                                if (board[i][j] != first) {
                                    repaint++;
                                }
                            }
                        }
                    }
                }
                if (repaint < min_repaint) {
                    min_repaint = repaint;
                }
            }
        }
        System.out.println(min_repaint);
    }
}
