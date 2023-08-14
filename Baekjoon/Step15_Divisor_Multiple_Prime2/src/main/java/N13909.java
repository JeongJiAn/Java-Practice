import java.io.*;

public class N13909 {

//    public static int get_divisor(int num) {
//        if (num == 1) {
//            return 1;
//        }
//        int cnt = 0;
//        for (int i = 1; i <= Math.sqrt(num); i++) {
//            if (i * i == num) {
//                cnt++;
//            } else if (num % i == 0) {
//                cnt += 2;
//            }
//        }
//        return cnt;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        bw.write(Integer.toString((int)Math.sqrt(N)) + "\n");

        bw.flush();
        bw.close();
    }
}
