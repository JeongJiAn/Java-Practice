import java.util.Scanner;

public class N10988 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean is_pal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                is_pal = false;
                break;
            }
        }
        if (is_pal) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}