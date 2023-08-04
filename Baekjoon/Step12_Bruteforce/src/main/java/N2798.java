import java.util.Scanner;

public class N2798 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = scan.nextInt();
        }

        int max_sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (max_sum < sum && sum <= M) {
                        max_sum = sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
    }
}
