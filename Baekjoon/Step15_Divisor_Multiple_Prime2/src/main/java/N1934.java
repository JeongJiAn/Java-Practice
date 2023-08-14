import java.io.*;
import java.util.StringTokenizer;

public class N1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            int max = A > B ? A : B, min = A < B ? A : B;
            int gcd = 1;
            while (true) {
                int n = max % min;
                if (n == 0) {
                    gcd = min;
                    break;
                } else {
                    max = min;
                    min = n;
                }
            }
            bw.write(Integer.toString(A * B / gcd) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
