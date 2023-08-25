import java.io.*;

public class N4779 {

    static char[] cant;

    public static void cantor(int N, int prev) {
        if (N == 1) {
            cant[0] = '-';
        } else {
            for (int i = 0; i < N / 3; i++) {
                cant[i] = '-';
                cant[N - i - 1] = '-';
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                cant[i] = ' ';
                cant[N - i - 1] = ' ';
            }
            for (int i = 0; i < prev / 2; i++) {
                cant[prev - i - 1] = cant[i];
            }

            cantor(N / 3, N);
            for (int i = 0; i < N / 2; i++) {
                cant[N - i - 1] = cant[i];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int N = (int)Math.pow(3, Integer.parseInt(input));
            cant = new char[N];
            cantor(N, N);
            for (int i = 0; i < N; i++) {
                bw.write(cant[i]);
            }
            bw.write('\n');
            bw.flush();
        }
        bw.close();

    }
}
