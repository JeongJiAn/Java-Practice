import java.util.Scanner;

public class N2292 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int stage = 1;
        int cnt = 1;
        while (true) {
            if (stage < n) {
                stage = stage + 6 * cnt;
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}
