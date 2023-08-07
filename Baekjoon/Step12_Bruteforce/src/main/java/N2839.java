import java.util.Scanner;

public class N2839 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), min_num = -1;

        for (int i = 0; i <= N / 5; i++) {
            int num = -1;
            if (i == 0) {
                if (N % 3 == 0) {
                    num = N / 3;
                }
            } else {
                int temp_N = N;
                temp_N = temp_N - 5 * i;
                if (temp_N % 3 == 0) {
                    num = i + temp_N / 3;
                }
            }
            if (min_num == -1) {
                min_num = num;
            } else {
                if (num != -1 && num < min_num) {
                    min_num = num;
                }
            }
        }
        System.out.println(min_num);
    }
}
