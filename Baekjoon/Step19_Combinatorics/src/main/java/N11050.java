import java.io.*;
import java.util.StringTokenizer;

public class N11050 {

    public static int bin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return bin(n - 1, k - 1) + bin(n - 1, k);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        bw.write(Integer.toString(bin(N, K)) + "\n");
        bw.flush();
        bw.close();
    }
}
