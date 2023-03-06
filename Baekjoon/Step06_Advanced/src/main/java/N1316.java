import java.util.Scanner;

public class N1316 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int group_numbers = 0;
        for (int i = 0; i < n; i++) {
            int[] alphabets = new int[26];
            boolean is_group = true;
            String str = scan.next();
            char prev_char = '\0';
            for (int j = 0; j < str.length(); j++) {
                if (alphabets[(int)str.charAt(j) - 97] > 0 && prev_char != str.charAt(j)) {
                    is_group = false;
                    break;
                }
                alphabets[(int)str.charAt(j) - 97]++;
                prev_char = str.charAt(j);
            }
            if (is_group) {
                group_numbers++;
            }
        }
        System.out.println(group_numbers);
    }
}
