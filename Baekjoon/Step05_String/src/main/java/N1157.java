import java.util.Arrays;
import java.util.Scanner;

public class N1157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String lower = str.toLowerCase();
        int max = 0;
        char max_alpha = 0;
        int[] alphabets = new int[26];
        for (int i = 0; i < lower.length(); i++) {
            alphabets[(int)lower.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (max < alphabets[i]) {
                max = alphabets[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] == max) {
                max_alpha = (char)(max_alpha + i + 65);
            }
        }
        if ((int)max_alpha > 90) {
            System.out.println("?");
        } else {
            System.out.println(max_alpha);
        }
    }
}
