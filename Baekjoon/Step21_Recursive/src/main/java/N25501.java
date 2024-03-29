import java.io.*;

public class N25501 {

    static int cnt = 0;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            cnt = 0;
            String str = br.readLine();
            int isPal = isPalindrome(str);
            bw.write(Integer.toString(isPal) + " " + Integer.toString(cnt) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
