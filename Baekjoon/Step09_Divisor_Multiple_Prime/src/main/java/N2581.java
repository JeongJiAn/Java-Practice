import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class N2581 {

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
        int M = scan.nextInt(), N = scan.nextInt(), sum = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (is_prime(i)) {
                primes.add(i);
                sum += i;
            }
        }
        if (primes.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(primes.get(0));
        }
    }
}
