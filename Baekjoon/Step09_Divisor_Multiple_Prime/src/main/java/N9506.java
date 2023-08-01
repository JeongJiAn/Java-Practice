import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N9506 {

    public static List<Integer> get_divisors(int num) {
        List<Integer> divs = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divs.add(i);
            }
        }
        return divs;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            List<Integer> divs = get_divisors(n);
            int sum = 0;
            for (int i = 0; i < divs.size(); i++) {
                sum += divs.get(i);
            }
            if (sum == n) {
                System.out.printf("%d = ", n);
                for (int i = 0; i < divs.size(); i++) {
                    System.out.printf("%d ", divs.get(i));
                    if (i + 1 != divs.size()) {
                        System.out.printf("+ ");
                    }
                }
                System.out.printf("\n");
            } else {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
    }
}
