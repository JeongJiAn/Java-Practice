import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class N1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        BigInteger[][] B = new BigInteger[30][30];

        for (int i = 0; i < 29; i++) {
            B[i][0] = new BigInteger("1");
            B[i][i] = new BigInteger("1");
        }

        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < i; j++) {
                BigInteger temp = B[i - 1][j - 1].add(B[i - 1][j]);
                B[i][j] = new BigInteger(temp.toString());
            }
        }

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            bw.write(B[M][N] + "");
            if (i + 1 < T) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
