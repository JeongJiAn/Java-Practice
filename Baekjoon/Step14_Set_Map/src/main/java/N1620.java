import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class N1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Map<String, Integer> dict_name = new HashMap<>();
        Map<Integer, String> dict_num = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            dict_num.put(i + 1, name);
            dict_name.put(name, i + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                int num = Integer.parseInt(input);
                bw.write(dict_num.get(num) + "\n");
            } catch (Exception e) {
                bw.write(dict_name.get(input) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
