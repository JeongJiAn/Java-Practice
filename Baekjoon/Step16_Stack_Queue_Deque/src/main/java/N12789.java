import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class N12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> students = new LinkedList<>();
        Stack<Integer> waiting = new Stack<>();
        for (int i = 0; i < N; i++) {
            students.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 1;
        while (!students.isEmpty()) {
            if (students.peek() == cnt ) {
                students.poll();
                cnt++;
            } else if (!waiting.isEmpty() && waiting.peek() == cnt) {
                waiting.pop();
                cnt++;
            } else {
                waiting.push(students.poll());
            }
        }

        while (!waiting.isEmpty() && waiting.peek() == cnt) {
            waiting.pop();
            cnt++;
        }

        if (!waiting.isEmpty()) {
            bw.write("Sad\n");
        } else {
            bw.write("Nice\n");
        }

        bw.flush();
        bw.close();
    }
}
