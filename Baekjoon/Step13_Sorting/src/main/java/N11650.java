import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }
        Arrays.sort(points);

        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(points[i].x) + " " + Integer.toString(points[i].y) + "\n");
        }

        bw.flush();
        bw.close();
    }
}

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x)
            return this.y - o.y;
        return this.x - o.x;
    }
}