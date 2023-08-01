import java.util.Scanner;

public class N1978 {

    public static boolean is_prime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if (is_prime(a)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
