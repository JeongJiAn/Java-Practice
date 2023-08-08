import java.io.*;
import java.util.Arrays;

public class N1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Word[] words = new Word[N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (s.compareTo(words[j].word) == 0) {
                    dup = true;
                    break;
                }
            }
            if (dup) {
                words[i] = new Word("");
            } else {
                words[i] = new Word(s);
            }
        }
        Arrays.sort(words);
        for (int i = 0; i < N; i++) {
            if (words[i].word == "") {
                continue;
            }
            bw.write(words[i].word + "\n");
        }
        bw.flush();
        bw.close();
    }

}

class Word implements Comparable<Word> {

    String word;
    public Word(String word_) {
        this.word = word_;
    }

    @Override
    public int compareTo(Word o) {
        if (this.word.length() == o.word.length()) {
            return -1 * o.word.compareTo(this.word);
        } else {
            return this.word.length() - o.word.length();
        }
    }
}