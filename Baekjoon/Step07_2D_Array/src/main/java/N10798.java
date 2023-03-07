import java.util.Scanner;

public class N10798 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max_len = 0;
        String[] strs = new String[5];
        for (int i = 0; i < 5; i++) {
            strs[i] = scan.next();
            if (max_len < strs[i].length()) {
                max_len = strs[i].length();
            }
        }
        char[][] chars = new char[5][max_len];
        for (int i = 0; i < 5; i++) {
            int j = 0;
            for (j = 0; j < strs[i].length(); j++) {
                chars[i][j] = strs[i].charAt(j);
            }
            for (int k = strs[i].length(); k < max_len; k++) {
                chars[i][j] = '\0';
            }
        }
        for (int j = 0; j < max_len; j++) {
            for (int i = 0; i < 5; i++) {
                if (chars[i][j] == '\0') {
                    continue;
                }
                System.out.printf("%c", chars[i][j]);
            }
        }
    }
}
