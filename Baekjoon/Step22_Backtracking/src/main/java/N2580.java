import java.io.*;
import java.util.StringTokenizer;

public class N2580 {

    static int[][] board_row = new int[9][9];
    static boolean row_done = false;

    public static void Sudoku(int[] position, int idx) {
        idx++;
        if (!row_done && idx < 9 && position[idx] != 0) {
            Sudoku(position, idx + 1);
        }
        else if (promising(position, idx)) {
            if (idx < 9) {
                for (int i = 1; i <= 9; i++) {
                    if (!row_done) {
                        position[idx] = i;
                        Sudoku(position, idx);
                    } else {
                        break;
                    }
                }
            } else {
                row_done = true;
            }
        }
    }

    public static boolean promising(int[] position, int idx) {
//        if (position[idx] != 0) {
//            return false;
//        }
        boolean promising = true;
        int k = 0;
        while (k < idx - 1 && promising) {
            if (position[idx - 1] == position[k]) {
                promising = false;
            }
            k++;
        }
        return promising;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > 0) {
                    board_row[num - 1][j] = i + 1;
                }
            }
        }

        for (int i = 0 ; i < 9; i++ ){
            Sudoku(board_row[i], -1);
            row_done = false;
        }

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                board[][board_row[i][j] - 1] = i + 1;
//            }
//        }

        for (int i = 0; i < 9; i++) {
            bw.write(Integer.toString(i + 1) +  " : ");
            for (int j = 0; j < 9; j++) {
                bw.write(Integer.toString(board_row[i][j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
