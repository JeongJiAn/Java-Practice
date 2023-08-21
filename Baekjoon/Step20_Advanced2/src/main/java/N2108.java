import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class N2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums_arr = new int[N];
        int sum = 0;
        HashMap<Integer, Integer> nums = new HashMap<>();
        Queue<Integer> most = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            nums_arr[i] = num;
            if (nums.containsKey(num)) {
                nums.put(num, nums.get(num) + 1);
            } else {
                nums.put(num, 1);
            }
        }

        Arrays.sort(nums_arr);

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (i > 0 && nums_arr[i] == nums_arr[i - 1]) {
                continue;
            }
            if (max < nums.get(nums_arr[i])) {
                max = nums.get(nums_arr[i]);
                most.clear();
                most.add(nums_arr[i]);
            } else if (max == nums.get(nums_arr[i])) {
                most.add(nums_arr[i]);
            }
        }

        int second_most = most.poll();
        if (!most.isEmpty()) {
            second_most = most.poll();
        }

        double avg = (double)sum / N;
        bw.write(Long.toString(Math.round(avg)) + "\n");
        bw.write(Integer.toString(nums_arr[N / 2]) + "\n");
        bw.write(Integer.toString(second_most) + "\n");
        bw.write(Integer.toString(nums_arr[N - 1] - nums_arr[0]) + "\n");
        bw.flush();
        bw.close();
    }
}
