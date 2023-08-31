import java.io.*;
import java.util.StringTokenizer;

public class N15652 {

    public static void get_sequence(int[] ans, int N, int M, int max, int cur, BufferedWriter bw) throws IOException {
        if (cur == M) {
            for (int i = 0; i < ans.length; i++) {
                bw.write(Integer.toString(ans[i]) + " ");
            }
            bw.write("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                if (max <= i) {
                    ans[cur] = i;
                    max = i;
                    cur++;
                    get_sequence(ans, N, M, max, cur, bw);
                    cur--;
                    ans[cur] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] ans = new int[M];
        get_sequence(ans, N, M, 0, 0, bw);
        bw.flush();
        bw.close();
    }
}
