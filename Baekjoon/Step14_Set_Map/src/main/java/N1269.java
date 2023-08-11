import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class N1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A_num = Integer.parseInt(st.nextToken()), B_num = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> set = new HashMap<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < A_num; i++) {
            set.put(Integer.parseInt(st2.nextToken()), 1);
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < B_num; i++) {
            int num = Integer.parseInt(st3.nextToken());
            if (set.containsKey(num)) {
                set.replace(num, 2);
            } else {
                set.put(num, 1);
            }
        }

        int cnt = 0;
        for (int key : set.keySet()) {
            if (set.get(key) == 1) {
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt) + "\n");
        bw.flush();
        bw.close();
    }
}
