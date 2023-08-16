import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class N2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            cards.add(i + 1);
        }

        int cnt = 1;
        while (cards.size() > 1) {
            if (cnt % 2 == 1) {
                cards.poll();
            } else {
                int card = cards.poll();
                cards.add(card);
            }
            cnt++;
        }
        bw.write(Integer.toString(cards.poll()) + '\n');
        bw.flush();
        bw.close();
    }
}
