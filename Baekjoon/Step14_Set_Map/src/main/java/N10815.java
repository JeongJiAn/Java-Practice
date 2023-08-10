import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] sang = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sang[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sang);
        int M = Integer.parseInt(br.readLine());
        int[] cards = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            boolean found = false;
            int low = 0, high = N - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (sang[mid] == cards[i]) {
                    found = true;
                    break;
                } else if (sang[mid] > cards[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (found) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}
