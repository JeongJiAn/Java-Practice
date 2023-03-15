import java.util.Scanner;

public class N27866 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int idx = scan.nextInt() - 1;
        System.out.printf("%c\n", str.charAt(idx));
    }
}
