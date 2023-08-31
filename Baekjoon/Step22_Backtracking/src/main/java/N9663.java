import java.io.*;

public class N9663 {

    static int cnt = 0;

    public static void NQueens(int[] position, int idx, int N) {
        if (promising(position, idx)) {
            if (idx == N) {
                cnt++;
            } else {
                for (int i = 1; i <= N; i++) {
                    position[idx + 1] = i;
                    NQueens(position, idx + 1, N);
                }
            }
        }
    }

    public static boolean promising(int[] position, int idx) {
        boolean promising = true;
        int k = 1;
        while (k < idx && promising) {
            if (position[idx] == position[k] || Math.abs(position[idx] - position[k]) == idx - k) {
                promising = false;
            }
            k++;
        }
        return promising;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] queens = new int[N + 1];
        NQueens(queens, 0, N);
        bw.write(Integer.toString(cnt) + "\n");
        bw.flush();
        bw.close();
    }
}
