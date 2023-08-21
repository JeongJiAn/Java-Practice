import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class N1300 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int min = 1, max = k;

        while (min < max) {
            int mid = (min + max) / 2;
            int cnt = 0;

            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }

            if (cnt >= k) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }

        bw.write(Integer.toString(min) + "\n");
        bw.flush();
        bw.close();
    }
}
//
//class Num implements Comparable<Num> {
//    int num;
//    int cnt;
//
//    public Num(int num, int cnt) {
//        this.num = num;
//        this.cnt = cnt;
//    }
//
//    @Override
//    public int compareTo(Num o) {
//        return o.num - this.num;
//    }
//}