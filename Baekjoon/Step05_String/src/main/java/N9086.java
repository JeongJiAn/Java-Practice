import java.util.Scanner;

public class N9086 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] answer = new String[t];
        for (int i = 0; i < t; i++) {
            String str = scan.next();
            String result = Character.toString(str.charAt(0)) + Character.toString(str.charAt(str.length() - 1));
            answer[i] = result;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}
