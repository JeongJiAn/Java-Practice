import java.util.Scanner;

public class N24313 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt(), a0 = scan.nextInt(), c = scan.nextInt(), n0 = scan.nextInt();
        if (a1 * n0 + a0 <= c * n0 && a1 * (n0 + 1) + a0 <= c * (n0 + 1) && n0 >= (double)a0 / (c - a1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
