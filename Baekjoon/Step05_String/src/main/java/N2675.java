import java.util.Scanner;

public class N2675 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            int r = scan.nextInt();
            String s = scan.next();
            String temp = "";
            for (int j = 0; j < s.length(); j++) {
                temp = temp + Character.toString(s.charAt(j)).repeat(r);
            }
            result[i] = temp;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
