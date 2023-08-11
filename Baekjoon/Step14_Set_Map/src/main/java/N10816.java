import javax.swing.plaf.synth.SynthUI;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class N10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> sang = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (sang.containsKey(num)) {
                sang.replace(num, sang.get(num) + 1);
            } else {
                sang.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (sang.containsKey(num)) {
                bw.write(Integer.toString(sang.get(num)) + " ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}
