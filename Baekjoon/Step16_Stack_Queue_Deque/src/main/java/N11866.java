import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;
        bw.write("<");
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cnt == K) {
                bw.write(Integer.toString(cur));
                if (!queue.isEmpty()) {
                    bw.write(", ");
                }
                cnt = 1;
            } else {
                queue.add(cur);
                cnt++;
            }
        }
        bw.write(">\n");
        bw.flush();
        bw.close();
    }
}
