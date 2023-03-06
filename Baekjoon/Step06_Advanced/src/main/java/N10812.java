import java.util.Scanner;

public class N10812 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            int begin = scan.nextInt() - 1, end = scan.nextInt() - 1, mid = scan.nextInt() - 1;
            int[] temp = new int[end - begin + 1];
            for (int j = 0; j < end - mid + 1; j++) {
                temp[j] = baskets[mid + j];
            }
            for (int j = 0; j < mid - begin; j++) {
                temp[j + end - mid + 1] = baskets[begin + j];
            }
            for (int j = 0; j < end - begin + 1; j++) {
                baskets[begin + j] = temp[j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", baskets[i]);
        }
    }
}
