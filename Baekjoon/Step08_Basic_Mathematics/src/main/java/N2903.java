import java.util.Scanner;

public class N2903 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = 2, N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            side = side * 2 - 1;
        }
        System.out.println(side * side);
    }
}
