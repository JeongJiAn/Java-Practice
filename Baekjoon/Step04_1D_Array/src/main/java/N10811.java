import java.util.Scanner;

public class N10811 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        int[] basckets = new int[N];
        for (int i = 0; i < N; i++) {
            basckets[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int a = scan.nextInt() - 1, b = scan.nextInt() - 1;
            for (int j = a; j <= (a + b) / 2; j++) {
                if (j > b + a - j) {
                    continue;
                }
                int temp = basckets[j];
                basckets[j] = basckets[b + a - j];
                basckets[b + a - j] = temp;
            }
        }
        for (int j = 0; j < N; j++) {
            System.out.printf("%d ", basckets[j]);
        }
    }
}
