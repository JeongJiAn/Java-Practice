import java.io.*;
import java.util.StringTokenizer;

public class N18236 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] d = new long[2 * N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            d[i * 2] = Integer.parseInt(st.nextToken());
            d[i * 2 + 1] = Integer.parseInt(st.nextToken());
        }

        long[][] M = new long[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            M[i][i] = 0;
        }

        for (int diagonal = 1; diagonal <= N - 1; diagonal++) {
            for (int i = 0; i < N - diagonal; i++) {
                int j = i + diagonal, k;
                long min = M[i][i] + M[i + 1][j] + d[2 * i] * d[2 * i + 1] * d[2 * j + 1];
                for (k = i + 1; k < j; k++) {
                    if (min > M[i][k] + M[k + 1][j] + d[2 * i] * d[2 * k + 1] * d[2 * j + 1]) {
                        min = M[i][k] + M[k + 1][j] + d[2 * i] * d[2 * k + 1] * d[2 * j + 1];
                    }
                }
                M[i][j] = min;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", M[i][j]);
            }
            System.out.println();
        }

        System.out.println(M[0][N - 1]);
    }
}
