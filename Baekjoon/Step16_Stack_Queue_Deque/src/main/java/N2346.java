import java.io.*;
import java.util.*;

public class N2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> balloons = new ArrayDeque<>();
        int[] moves = new int[N];
        for (int i = 0; i < N; i++) {
            balloons.add(i + 1);
            moves[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(Integer.toString(balloons.pollFirst()) + ' ');
        int move = moves[0];
        while (!balloons.isEmpty()) {
            if (move > 0) {
                int cnt = 0;
                while (cnt < move) {
                    int balloon = balloons.pollFirst();
                    balloons.offerLast(balloon);
                    cnt++;
                }
                int pop = balloons.pollLast();
                move = moves[pop - 1];
                bw.write(Integer.toString(pop) + " ");
            } else {
                int cnt = 0;
                move = -1 * move;
                while (cnt < move) {
                    int balloon = balloons.pollLast();
                    balloons.offerFirst(balloon);
                    cnt++;
                }
                int pop = balloons.pollFirst();
                move = moves[pop - 1];
                bw.write(Integer.toString(pop) + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
