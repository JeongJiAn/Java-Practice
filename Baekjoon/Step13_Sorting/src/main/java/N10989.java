import java.io.*;

public class N10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int[] counting = new int[10000];
        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(bf.readLine()) - 1]++;
        }

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < counting[i]; j++) {
                bw.write(Integer.toString(i + 1) + '\n');
            }
        }
        bw.flush();
        bw.close();
    }
}
