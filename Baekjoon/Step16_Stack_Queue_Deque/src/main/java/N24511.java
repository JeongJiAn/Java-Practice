import javax.management.ObjectName;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N24511 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] isStack = new int[N];
        Deque<Integer> nums = new ArrayDeque<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            isStack[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (isStack[i] == 0) {
                nums.add(num);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int new_num = Integer.parseInt(st3.nextToken());
            nums.offerFirst(new_num);
            bw.write(Integer.toString(nums.pollLast()) + " ");
        }

        bw.flush();
        bw.close();
    }
}
