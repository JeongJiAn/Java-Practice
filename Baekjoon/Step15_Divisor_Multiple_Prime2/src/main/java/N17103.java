import java.io.*;

public class N17103 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        boolean[] sieve = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (sieve[i]) {
                for (int j = i + i; j < 1000000; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int mid = n / 2, left = mid, right = mid;
            int cnt = 0;
            while (right < n && left > 1) {
                while (!sieve[left]) {
                    left--;
                }
                while (!sieve[right]) {
                    right++;
                }
                if (left + right == n) {
                    cnt++;
                    left--;
                    right++;
                } else if (left + right > n) {
                    left--;
                } else if (left + right < n) {
                    right++;
                }
            }
            bw.write(Integer.toString(cnt) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
