import java.util.Scanner;

public class N2720 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] amount = {25, 10, 5, 1};
        int n = scan.nextInt();
        int[] charges = new int[n];
        for (int i = 0; i < n; i++) {
            charges[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int[] counts = new int[4];
            for (int j = 0; j < 4; j++) {
                counts[j] = charges[i] / amount[j];
                charges[i] = charges[i] % amount[j];
            }
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", counts[j]);
            }
            System.out.println("");
        }
    }
}
