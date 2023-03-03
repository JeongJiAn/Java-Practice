import java.util.Scanner;

public class N11720 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String input = scan.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
