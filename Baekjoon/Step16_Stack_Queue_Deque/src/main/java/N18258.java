import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class N18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()), back = -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.compareTo("push") == 0) {
                back = Integer.parseInt(st.nextToken());
                queue.add(back);
            } else if (command.compareTo("pop") == 0) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(queue.poll()) + "\n");
                }
            } else if (command.compareTo("size") == 0) {
                bw.write(Integer.toString(queue.size()) + "\n");
            } else if (command.compareTo("empty") == 0) {
                if (queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command.compareTo("front") == 0) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(queue.peek()) + "\n");
                }
            } else if (command.compareTo("back") == 0) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(back) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
