import java.io.*;
import java.util.Stack;

public class N4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;
            if (input.compareTo(".") == 0) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.charAt(i));
                } else if (input.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    } else {
                        if (stack.peek() != '(') {
                            balanced = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                } else if (input.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    } else {
                        if (stack.peek() != '[') {
                            balanced = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }
            }
            if (input.charAt(input.length() - 1) != '.' || !stack.isEmpty()) {
                balanced = false;
            }
            if (balanced) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
