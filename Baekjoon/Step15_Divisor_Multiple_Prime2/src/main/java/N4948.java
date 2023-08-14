import java.io.*;

public class N4948 {

    public static boolean is_prime(int num) {
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
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int cnt = 0;
            for (int j = n + 1; j <= 2 * n; j++) {
                if (is_prime(j)) {
                    cnt++;
                }
            }
            bw.write(Integer.toString(cnt) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
