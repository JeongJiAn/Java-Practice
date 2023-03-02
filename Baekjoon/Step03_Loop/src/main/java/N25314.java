import java.util.Scanner;

public class N25314 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "int";
        int n = scan.nextInt();
        for (int i = 0; i < n / 4; i++) {
            result = "long " + result;
        }
        System.out.println(result);
    }
}
