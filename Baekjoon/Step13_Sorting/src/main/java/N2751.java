import java.util.PriorityQueue;
import java.util.Scanner;

public class N2751 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int i = 0; i < N; i++) {
            heap.add(scan.nextInt());
        }

        for (int i = 0; i < N; i++) {
            stringBuilder.append(heap.poll().toString() + '\n');
        }
        System.out.println(stringBuilder);
    }
}
