import java.util.Scanner;

public class N10813 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        int[] basckets = new int[N];
        for (int i = 0; i < N; i++) {
            basckets[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt(), b = scan.nextInt();
            int temp = basckets[a - 1];
            basckets[a - 1] = basckets[b - 1];
            basckets[b - 1] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", basckets[i]);
        }
    }
}
