import java.util.List;
import java.util.Scanner;

public class N5073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int[] sides = new int[3];
            int max = 0, sum = 0;
            for (int i = 0; i < 3; i++) {
                sides[i] = scan.nextInt();
                if (max < sides[i]) {
                    max = sides[i];
                }
                sum += sides[i];
            }
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }
            if (sum - max > max) {
                if (sides[0] == sides[1] && sides[1] == sides[2]) {
                    System.out.println("Equilateral");
                } else if ((sides[0] == sides[1] && sides[0] != sides[2]) || (sides[1] == sides[2] && sides[1] != sides[0]) || (sides[0] == sides[2] && sides[0] != sides[1])) {
                    System.out.println("Isosceles");
                } else if (sides[0] != sides[1] && sides[1] != sides[2]) {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
