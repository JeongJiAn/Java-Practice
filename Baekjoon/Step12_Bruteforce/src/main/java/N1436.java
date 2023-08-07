import java.util.Scanner;

public class N1436 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), num = 0, cnt = 0;
        while (cnt < N) {
            num++;
            String numstr = Integer.toString(num);
            if (numstr.contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
