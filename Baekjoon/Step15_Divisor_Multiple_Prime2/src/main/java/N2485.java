import java.io.*;

public class N2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int[] dist = new int[N - 1];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                dist[i - 1] = trees[i] - trees[i - 1];
            }
        }
        int gcd = dist[0];

        for (int i = 1; i < N - 1; i++) {
            int max = gcd > dist[i] ? gcd : dist[i], min = gcd < dist[i] ? gcd : dist[i];
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
        }
        int cnt = 0, needed = 0;
        for (int i = trees[0]; i < trees[N - 1]; i = i + gcd) {
            if (i == trees[cnt]) {
                cnt++;
            } else {
                needed++;
            }
        }
        bw.write(Integer.toString(needed) + "\n");
        bw.flush();
        bw.close();
    }
}
