import java.io.*;

public class N15439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(N * N - N) + "\n");
        bw.flush();
        bw.close();
    }
}
