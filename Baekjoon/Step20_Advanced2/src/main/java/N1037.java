import java.io.*;
import java.util.StringTokenizer;

public class N1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()), min = -1, max = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i == 0) {
                min = num;
                max = num;
            } else {
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            }
        }
        bw.write(Integer.toString(min * max) + "\n");
        bw.flush();
        bw.close();
    }
}
