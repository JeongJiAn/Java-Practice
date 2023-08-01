import java.util.Scanner;

public class N11653 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), divisor = 2;

        if (N != 1) {
            while (N > 1) {
                if (N % divisor != 0) {
                    divisor++;
                    continue;
                }
                System.out.println(divisor);
                N = N / divisor;
            }
        }
    }
}
