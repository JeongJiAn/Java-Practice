import java.io.*;

public class N24723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(Integer.toString((int)Math.pow(2, N)) + "\n");
        bw.flush();
        bw.close();
    }
}
