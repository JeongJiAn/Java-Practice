import java.io.*;

public class N11729 {

    public static void hanoi(int num, int start, int end, int mediator, BufferedWriter bw) throws IOException {
        if (num == 1) {
            bw.write(Integer.toString(start) + " " + Integer.toString(end) + "\n");
        } else {
            hanoi(num - 1, start, mediator, end, bw);
            bw.write(Integer.toString(start) + " " + Integer.toString(end) + "\n");
            hanoi(num - 1, mediator, end, start, bw);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bw.write(Integer.toString((int)Math.pow(2, N) - 1) + '\n');
        hanoi(N, 1, 3, 2, bw);
        bw.flush();
        bw.close();
    }
}
