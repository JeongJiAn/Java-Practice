import java.util.Scanner;

public class N5622 {

    public static int getTime(char alpha) {
        if (alpha == 'A' || alpha == 'B' || alpha == 'C') {
            return 3;
        } else if (alpha == 'D' || alpha == 'E' || alpha == 'F') {
            return 4;
        } else if (alpha == 'G' || alpha == 'H' || alpha =='I') {
            return 5;
        } else if (alpha == 'J' || alpha == 'K' || alpha == 'L') {
            return 6;
        } else if (alpha == 'M' || alpha == 'N' || alpha == 'O') {
            return 7;
        } else if (alpha == 'P' || alpha == 'Q' || alpha == 'R' || alpha == 'S') {
            return 8;
        } else if (alpha == 'T' || alpha == 'U' || alpha == 'V') {
            return 9;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += getTime(str.charAt(i));
        }
        System.out.println(sum);
    }
}
