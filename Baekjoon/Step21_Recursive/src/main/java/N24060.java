import java.io.*;
import java.util.StringTokenizer;

public class N24060 {

    static int cnt = 0;
    static int k;

    public static void merge_sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int[] temp = new int[r - p + 1];
        int i = p, j = q + 1, t = 1;
        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[t - 1] = arr[i];
                t++;
                i++;
            } else {
                temp[t - 1] = arr[j];
                t++;
                j++;
            }
        }
        while (i <= q) {
            temp[t - 1] = arr[i];
            t++;
            i++;
        }
        while (j <= r) {
            temp[t - 1] = arr[j];
            t++;
            j++;
        }
        i = p;
        t = 1;
        while (i <= r) {
            arr[i] = temp[t - 1];
            cnt++;
            if (k == cnt) {
                System.out.println(arr[i]);
            }
            i++;
            t++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[A];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        merge_sort(arr, 0, A - 1);
        if (cnt < k) {
            System.out.println(-1);
        }
    }
}
