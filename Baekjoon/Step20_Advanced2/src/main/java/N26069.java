import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N26069 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> dancing = new HashMap<>();
        dancing.put("ChongChong", 1);
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken(), B = st.nextToken();
            if (dancing.containsKey(A) && !dancing.containsKey(B)) {
                dancing.put(B, 1);
            } else if (!dancing.containsKey(A) && dancing.containsKey(B)) {
                dancing.put(A, 1);
            }
        }
        bw.write(Integer.toString(dancing.size()) + "\n");
        bw.flush();
        bw.close();
    }
}
