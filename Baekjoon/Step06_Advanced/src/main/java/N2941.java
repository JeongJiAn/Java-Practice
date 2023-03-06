import java.util.Scanner;

public class N2941 {

    public static boolean check_two_queue(char[] queue) {
        if (queue[0] == 'c' && queue[1] == '=') {
            return true;
        } else if (queue[0] == 'c' && queue[1] == '-') {
            return true;
        } else if (queue[0] == 'd' && queue[1] == '-') {
            return true;
        } else if (queue[0] == 'l' && queue[1] == 'j') {
            return true;
        } else if (queue[0] == 'n' && queue[1] == 'j') {
            return true;
        } else if (queue[0] == 's' && queue[1] == '=') {
            return true;
        } else if (queue[0] == 'z' && queue[1] == '=') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean check_three_queue(char[] queue) {
        if (queue[0] == 'd' && queue[1] == 'z' && queue[2] == '=') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] two_queue = new char[2];
        char[] three_queue = new char[3];
        int num_alpha = 0;
        for (int i = 0; i < str.length(); i++) {
            num_alpha++;
            if (i > 1) {
                two_queue[0] = two_queue[1];
                two_queue[1] = str.charAt(i);
            } else {
                two_queue[i] = str.charAt(i);
            }
            if (i > 2) {
                three_queue[0] = three_queue[1];
                three_queue[1] = three_queue[2];
                three_queue[2] = str.charAt(i);
            } else {
                three_queue[i] = str.charAt(i);
            }

            if (check_two_queue(two_queue)) {
                num_alpha--;
            }
            if (check_three_queue(three_queue)) {
                num_alpha--;
            }
        }
        System.out.println(num_alpha);
    }
}
