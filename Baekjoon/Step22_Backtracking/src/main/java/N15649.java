import java.io.*;
import java.util.StringTokenizer;

public class N15649 {

    public static void get_sequence(int[] ans, int N, int max, int cur, BufferedWriter bw) throws IOException {
        if (cur == max) {
            for (int i = 0; i < ans.length; i++) {
                bw.write(Integer.toString(ans[i]) + " ");
            }
            bw.write("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                boolean exist = false;
                for (int j = 0; j < cur; j++) {
                    if (ans[j] == i) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    ans[cur] = i;
                    cur++;
                    get_sequence(ans, N, max, cur, bw);
                    cur--;
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
        get_sequence(ans, N, M, 0, bw);
        bw.flush();
        bw.close();
    }
}