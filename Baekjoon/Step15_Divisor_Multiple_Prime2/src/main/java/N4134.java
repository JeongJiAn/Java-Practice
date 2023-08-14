import java.io.*;

public class N4134 {

    public static boolean is_prime(long num) {
        if (num == 1 || num == 0) {
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
        long N = Long.parseLong(br.readLine());
        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());
            for (long j = n; true; j++) {
                if (is_prime(j)) {
                    bw.write(Long.toString(j) + '\n');
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
