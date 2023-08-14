import java.io.*;
import java.util.StringTokenizer;

public class N1735 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] denominator = new int[2];
        int[] numerator = new int[2];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            denominator[i] = Integer.parseInt(st.nextToken());
            numerator[i] = Integer.parseInt(st.nextToken());
        }
        int max = numerator[0] > numerator[1] ? numerator[0] : numerator[1], min = numerator[0] < numerator[1] ? numerator[0] : numerator[1];
        int gcd;
        while (true) {
            int n = max % min;
            if (n == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = n;
            }
        }
        int lcd = numerator[0] * numerator[1] / gcd;
        int denom = denominator[0] * (lcd / numerator[0]) + denominator[1] * (lcd / numerator[1]);
        int tem_lcd = lcd, temp_denom = denom;
        while (true) {
            int n = tem_lcd % temp_denom;
            if (n == 0) {
                gcd = temp_denom;
                break;
            } else {
                tem_lcd = temp_denom;
                temp_denom = n;
            }
        }
        bw.write(Integer.toString(denom / gcd) + " " + Integer.toString(lcd / gcd));
        bw.flush();
        bw.close();
   }
}
