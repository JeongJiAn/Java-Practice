import java.util.Arrays;
import java.util.Scanner;

public class N10809 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            char char_of_str = str.charAt(i);
            if (alphabets[char_of_str - 97] == -1) {
                alphabets[char_of_str - 97] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.printf("%d ", alphabets[i]);
        }
    }
}
