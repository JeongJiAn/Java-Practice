import java.util.Scanner;

public class N10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        int[] bascket = new int[N];
        for (int i = 0; i < N; i++) {
            bascket[i] = 0;
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
            for (int j = a; j <= b; j++) {
                bascket[j - 1] = c;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", bascket[i]);
        }
    }
}
