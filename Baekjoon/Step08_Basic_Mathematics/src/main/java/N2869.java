import java.util.Scanner;

public class N2869 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), v = scan.nextInt();
        if ((v - a) % (a - b) == 0) {
            System.out.println(1 + (v - a) / (a - b));
        } else {
            System.out.println(2 + (v - a) / (a - b));
        }
    }
}
