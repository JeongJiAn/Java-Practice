import java.util.Scanner;

public class N1193 {

    public static int get_sum(int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = 1;
        while (true) {
            if (get_sum(cnt) >= n) {
                if (cnt % 2 == 0) {
                    int up = cnt - (get_sum(cnt) - n) ;
                    int down = 1 + (get_sum(cnt) - n);
                    System.out.printf("%d/%d\n", up, down);
                } else {
                    int up = 1 + (get_sum(cnt) - n);
                    int down = cnt - (get_sum(cnt) - n);
                    System.out.printf("%d/%d\n", up, down);
                }
                break;
            } else {
                cnt++;
            }
        }
    }
}
