import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken()), M = Integer.parseInt(st1.nextToken()), cnt = 0;
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            boolean found = false;
            int low = 0, high = N - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (str.compareTo(S[mid]) == 0) {
                    found = true;
                    break;
                } else if (str.compareTo(S[mid]) > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (found) {
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
