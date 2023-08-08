import java.io.*;

public class N1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int[] counting = new int[10];

        while (N > 0) {
            counting[N % 10]++;
            N = N / 10;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < counting[i]; j++) {
                bw.write(Integer.toString(i));
            }
        }

        bw.flush();
        bw.close();
    }
}
