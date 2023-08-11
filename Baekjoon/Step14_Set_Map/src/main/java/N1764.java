import java.io.*;
import java.util.*;

public class N1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Map<String, Integer> names = new HashMap<>();

        for (int i = 0; i < N; i++) {
            names.put(br.readLine(), i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> sorted = new ArrayList<String >();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (names.containsKey(input)) {
                cnt++;
                sorted.add(input);
            }
        }
        sorted.sort(Comparator.naturalOrder());
        bw.write(Integer.toString(cnt) + "\n");
        for (int i = 0; i < sorted.size(); i++) {
            bw.write(sorted.get(i) + '\n');
        }
        bw.flush();
        bw.close();
    }
}
