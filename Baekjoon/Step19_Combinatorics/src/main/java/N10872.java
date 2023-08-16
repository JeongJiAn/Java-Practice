import java.io.*;

public class N10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int facto = 1;
        for (int i = 1; i <= N; i++) {
            facto *= i;
        }
        bw.write(Integer.toString(facto) + "\n");

        bw.flush();
        bw.close();
    }
}
