import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class N11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Map<String, Integer> set = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                if (!set.containsKey(sub)) {
                    set.put(sub, 1);
                }
            }
        }
        int cnt = 0;
        for (String key : set.keySet()) {
            cnt++;
        }
        bw.write(Integer.toString(cnt) + '\n');
        bw.flush();
        bw.close();
    }
}
