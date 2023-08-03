import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N9063 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<int[]> dots = new ArrayList<int[]>();

        for (int i = 0; i < N; i++) {
            int[] dot = new int[2];
            dot[0] = scan.nextInt();
            dot[1] = scan.nextInt();
            dots.add(dot);
        }

        int min_x = 10001, max_x = -10001, min_y = 10001, max_y = -10001;
        for (int i = 0; i < N; i++) {
            if (min_x > dots.get(i)[0]) {
                min_x = dots.get(i)[0];
            }
            if (max_x < dots.get(i)[0]) {
                max_x = dots.get(i)[0];
            }
            if (min_y > dots.get(i)[1]) {
                min_y = dots.get(i)[1];
            }
            if (max_y < dots.get(i)[1]) {
                max_y = dots.get(i)[1];
            }
        }

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}
