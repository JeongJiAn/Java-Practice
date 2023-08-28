import java.io.*;

public class N2447 {

    static char[][] star;

    public static void makeStar(int N, int prev) {
        if (N == 1) {
            star[0][0] = '*';
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i >= N / 3 && i < 2 * N / 3 && j >= N / 3 && j < 2 * N / 3) {
                        star[i][j] = ' ';
                    } else {
                        star[i][j] = '*';
                    }
                }
            }

            if (N != prev) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (!(i + a * prev / 3 >= prev / 3 && i + a * prev / 3 < 2 * prev / 3 && j + b * prev / 3 >= prev / 3 && j + b * prev / 3 < 2 * prev / 3)) {
                                    star[i + a * prev / 3][j + b * prev / 3] = star[i][j];
                                }
                            }
                        }
                    }
                }
            }
            makeStar(N / 3, N);
            if (N != prev) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (!(i + a * prev / 3 >= prev / 3 && i + a * prev / 3 < 2 * prev / 3 && j + b * prev / 3 >= prev / 3 && j + b * prev / 3 < 2 * prev / 3)) {
                                    star[i + a * prev / 3][j + b * prev / 3] = star[i][j];
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];
        makeStar(N, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(star[i][j]);
            }
            bw.write('\n');
        }
        bw.flush();
        bw.close();
    }
}
