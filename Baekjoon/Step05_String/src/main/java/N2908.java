import java.util.Scanner;

public class N2908 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next(), num2 = scan.next();
        for (int i = 2; i >= 0; i--) {
            if ((int)num1.charAt(i) > (int)num2.charAt(i)) {
                for (int j = 2; j >= 0; j--) {
                    System.out.printf("%c", num1.charAt(j));
                }
                System.out.println("");
                break;
            } else if ((int)num1.charAt(i) < (int)num2.charAt(i)) {
                for (int j = 2; j >= 0; j--) {
                    System.out.printf("%c", num2.charAt(j));
                }
                System.out.println("");
                break;
            }
        }
    }
}
