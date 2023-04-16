import java.util.Scanner;

public class N2745 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        int B = scan.nextInt();
        long num = 0;
        for (int i = 0; i < N.length(); i++) {
            int digit;
            if (Character.isLetter(N.charAt(i))) {
                digit = N.charAt(i) - 'A' + 10;
            } else {
                digit = N.charAt(i) - '0';
            }
            num += digit * Math.pow(B, N.length() - i - 1);
        }
        System.out.println(num);
    }
}
