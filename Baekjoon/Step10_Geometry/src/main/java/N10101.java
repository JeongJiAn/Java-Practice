import java.util.Scanner;

public class N10101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] angles = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            angles[i] = scan.nextInt();
            sum += angles[i];
        }
        if (sum == 180) {
            if (angles[0] == angles[1] && angles[1] == angles[2]) {
                System.out.println("Equilateral");
            } else if ((angles[0] == angles[1] && angles[0] != angles[2]) || (angles[1] == angles[2] && angles[1] != angles[0]) || (angles[0] == angles[2] && angles[0] != angles[1])) {
                System.out.println("Isosceles");
            } else if (angles[0] != angles[1] && angles[1] != angles[2] && angles[0] != angles[2]) {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
