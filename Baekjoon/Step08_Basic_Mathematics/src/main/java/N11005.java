import java.util.Scanner;

public class N11005 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();
        String result = "";

        while (N > 0) {
            int remainder = N % B;
            char pos;
            if (remainder >= 10) {
                pos = (char)(remainder - 10 + 'A');
            } else {
                pos = (char)(remainder + '0');
            }
            result += pos;
            N = N / B;
        }
        StringBuffer sb = new StringBuffer(result);
        String reversed = sb.reverse().toString();

        System.out.println(reversed);
    }
}
