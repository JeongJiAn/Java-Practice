import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class N15945 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++){
            int num = scan.nextInt();
            nums.add(num);
        }
        nums.sort(Comparator.naturalOrder());

        int i = 1;
        while (i < nums.size() - 1) {
            if (nums.get(0) + nums.get(nums.size() - i - 1) <= nums.get(nums.size() - 1)) {
                nums.set(0, nums.get(0) + nums.get(nums.size() - i - 1));
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.size(); j++) {
            System.out.println(nums.get(j));
        }
    }
}
