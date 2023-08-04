import java.util.Scanner;

public class N19532 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt(), e = scan.nextInt(), f = scan.nextInt();
        boolean found = false;
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a * x + b * y == c) && (d * x + e * y == f)) {
                    System.out.printf("%d %d\n", x, y);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}
