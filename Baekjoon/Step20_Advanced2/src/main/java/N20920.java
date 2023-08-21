import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N20920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> words_input = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) {
                continue;
            }
            if (words_input.containsKey(word)) {
                words_input.put(word, words_input.get(word) + 1);
            } else {
                words_input.put(word, 1);
            }
        }
        Words[] words = new Words[words_input.size()];
        int cnt = 0;
        for (String key : words_input.keySet()) {
            words[cnt] = new Words(key, words_input.get(key), key.length());
            cnt++;
        }
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            bw.write(words[i].word + '\n');
        }
        bw.flush();
        bw.close();
    }
}

class Words implements Comparable<Words> {

    String word;
    int count;
    int length;

    public Words(String word, int count, int length) {
        this.word = word;
        this.count = count;
        this.length = length;
    }

    @Override
    public int compareTo(Words o) {
        if (this.count == o.count) {
            if (this.length == o.length) {
                return -1 * o.word.compareTo(this.word);
            } else {
                return o.length - this.length;
            }
        } else {
            return o.count - this.count;
        }
    }
}