import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class N28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (command == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(stack.pop()) + "\n");
                }
            } else if (command == 3) {
                bw.write(Integer.toString(stack.size()) + "\n");
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command == 5) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(stack.peek()) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
