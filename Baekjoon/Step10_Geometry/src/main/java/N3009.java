import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N3009 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<int[]> dots = new ArrayList<int[]>();
        for (int i = 0; i < 3; i++) {
            int x = scan.nextInt(), y = scan.nextInt();
            int[] dot = {x, y};
            dots.add(dot);
        }
        int[] cor = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (dots.get(i)[0] != dots.get(j)[0] && dots.get(i)[1] != dots.get(j)[1]) {
                    cor[0] = dots.get(i)[0] + dots.get(j)[0] - dots.get(3 - i - j)[0];
                    cor[1] = dots.get(i)[1] + dots.get(j)[1] - dots.get(3 - i - j)[1];
                }
            }
        }
        System.out.printf("%d %d\n",cor[0], cor[1]);
    }
}
