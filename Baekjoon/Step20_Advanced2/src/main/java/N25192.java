import java.io.*;
import java.util.HashMap;

public class N25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()), cnt = 0;
        HashMap<String, Integer> chat = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.compareTo("ENTER") != 0) {
                if (!chat.containsKey(input)) {
                    chat.put(input, 1);
                    cnt++;
                }
            } else {
                chat.clear();
            }
        }
        bw.write(Integer.toString(cnt) + "\n");
        bw.flush();
        bw.close();
    }
}
