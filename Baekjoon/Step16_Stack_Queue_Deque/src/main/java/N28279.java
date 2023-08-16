import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            } else if (command == 2) {
                deque.offerLast(Integer.parseInt(st.nextToken()));
            } else if (command == 3) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(deque.pollFirst()) + '\n');
                }
            } else if (command == 4) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(deque.pollLast()) + "\n");
                }
            } else if (command == 5) {
                bw.write(Integer.toString(deque.size()) + "\n");
            } else if (command == 6) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command == 7) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(deque.peekFirst()) + "\n");
                }
            } else if (command == 8) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(deque.peekLast()) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
