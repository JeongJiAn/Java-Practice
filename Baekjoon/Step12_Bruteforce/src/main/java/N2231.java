import java.util.Scanner;

public class N2231 {

    public static int get_sum(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        boolean is_construct = false;
        for (int i = 1; i < N; i++) {
            int sum = get_sum(i);
            if (sum == N) {
                System.out.println(i);
                is_construct = true;
                break;
            }
        }
        if (!is_construct) {
            System.out.println(0);
        }
    }
}
