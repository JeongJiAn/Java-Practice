import java.io.*;

public class N27433 {

    public static long facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(Long.toString(facto(N)) + '\n');
        bw.flush();
        bw.close();
    }
}
