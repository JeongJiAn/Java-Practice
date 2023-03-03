import java.util.Scanner;

public class N1152 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        int num = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}
