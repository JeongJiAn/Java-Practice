import java.io.*;
import java.util.StringTokenizer;

public class N1929 {

    public static boolean is_prime(long num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        for (int i = M; i <= N; i++) {
            if (is_prime(i)) {
                bw.write(Integer.toString(i) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
