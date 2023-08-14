import java.io.*;
import java.util.StringTokenizer;

public class N13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken()), B = Long.parseLong(st.nextToken());
        long max = A > B ? A : B, min = A < B ? A : B;
        long gcd;
        while (true) {
            long n = max % min;
            if (n == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = n;
            }
        }
        bw.write(Long.toString(A * B / gcd) + "\n");
        bw.flush();
        bw.close();
    }
}
