import java.util.Scanner;

public class N14215 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sides = new int[3];
        int max = 0, sum = 0;
        for (int i = 0; i < 3; i++) {
            sides[i] = scan.nextInt();
            if (max < sides[i]) {
                max = sides[i];
            }
            sum += sides[i];
        }
        if (sum - max <= max) {
            int temp_sum = sum;
            sum = sum - max;
            max = max - (2 * max - temp_sum) - 1;
            sum = sum + max;
        }
        System.out.println(sum);
    }
}
