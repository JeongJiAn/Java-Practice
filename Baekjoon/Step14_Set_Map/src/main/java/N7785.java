import java.io.*;
import java.util.*;

public class N7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<String, Boolean> employees = new HashMap();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if (status.compareTo("enter") == 0) {
                employees.put(name, true);
            } else if (status.compareTo("leave") == 0) {
                employees.remove(name);
            }
        }

        List<String> keySet = new ArrayList<String>(employees.keySet());
        Collections.sort(keySet, Collections.reverseOrder());

        for (String key:keySet) {
            bw.write(key + "\n");
        }
        bw.flush();
        bw.close();

    }
}
