import java.util.Scanner;

public class N2587 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int avg = sum / 5;
        System.out.println(avg);
        System.out.println(nums[2]);
    }
}
