import java.io.*;
import java.util.Stack;

public class N9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Stack<Integer> stack = new Stack<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    stack.push(1);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(1);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
