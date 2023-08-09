import java.io.*;
import java.util.*;

public class N18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Cor[] cors = new Cor[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cor = Integer.parseInt(st.nextToken());
            cors[i] = new Cor(cor, i);
        }
        Arrays.sort(cors);
        int[] result = new int[N];
        int cnt = -1;
        for (int i = 0; i < N; i++) {
            if (cors[i].orgIdx == cors[i].idx) {
                cnt++;
            }
            result[cors[i].orgIdx] = cnt;
        }
        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(result[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}

class Cor implements Comparable<Cor> {

    int cor;
    int idx;
    int orgIdx;
    public Cor(int cor_, int idx_) {
        this.cor = cor_;
        this.idx = idx_;
        this.orgIdx = idx_;
    }

    @Override
    public int compareTo(Cor o) {
        if (this.cor == o.cor) {
            int min = this.idx < o.idx ? this.idx : o.idx;
            this.idx = min;
            o.idx = min;
            return this.orgIdx - o.orgIdx;
        }
        return this.cor - o.cor;
    }
}