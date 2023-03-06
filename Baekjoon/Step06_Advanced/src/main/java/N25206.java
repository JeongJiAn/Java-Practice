import java.util.Scanner;

public class N25206 {

    public static double grade2credit(String grade) {
        if (grade.equals("A+")) {
            return 4.5;
        } else if (grade.equals("A0")) {
            return 4.0;
        } else if (grade.equals("B+")) {
            return 3.5;
        } else if (grade.equals("B0")) {
            return 3.0;
        } else if (grade.equals("C+")) {
            return 2.5;
        } else if (grade.equals("C0")) {
            return 2.0;
        } else if (grade.equals("D+")) {
            return 1.5;
        } else if (grade.equals("D0")) {
            return 1.0;
        } else if (grade.equals("F")) {
            return 0.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subject_num = 0;
        double sum = 0.0;
        for (int i = 0; i < 20; i++) {
            String name = scan.next();
            double credit = scan.nextDouble();
            String grade = scan.next();
            if (grade.equals("P")) {
                continue;
            }
            subject_num += credit;
            sum += credit * grade2credit(grade);
        }
        System.out.printf("%f\n", sum / subject_num);
    }
}
