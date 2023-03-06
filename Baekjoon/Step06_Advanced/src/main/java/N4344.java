import java.util.Scanner;

public class N4344 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        double[] over_avg = new double[c];
        for (int i = 0; i < c; i++) {
            int n = scan.nextInt();
            int sum = 0;
            int[] grades = new int[n];
            for (int j = 0; j < n; j++) {
                grades[j] = scan.nextInt();
                sum += grades[j];
            }
            double avg = (double)sum / n;
            for (int j = 0; j < n; j++) {
                if (grades[j] > avg) {
                    over_avg[i]++;
                }
            }
            over_avg[i] = over_avg[i] / n * 100;
        }
        for (int i = 0; i < c; i++) {
            System.out.printf("%.3f%%\n", over_avg[i]);
        }
    }
}
