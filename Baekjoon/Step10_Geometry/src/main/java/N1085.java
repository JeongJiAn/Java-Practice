import java.util.Scanner;

public class N1085 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt(), w = scan.nextInt(), h = scan.nextInt();
        int result = (w - x < h - y ? w - x : h - y) < (x < y ? x : y) ? (w - x < h - y ? w - x : h - y) : (x < y ? x : y);
        System.out.println(result);
    }
}
