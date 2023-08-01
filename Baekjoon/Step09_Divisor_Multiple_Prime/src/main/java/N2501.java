import java.util.Scanner;

public class N2501 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), K = scan.nextInt(), cnt = 0, i = 1, div = i;
        while (cnt < K) {
            if (i > N) {
                div = 0;
                break;
            }
            if (N % i == 0) {
                cnt++;
                div = i;
            }
            i++;
        }
        System.out.println(div);
    }
}
