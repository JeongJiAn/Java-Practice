import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(name, age, i);
        }
        Arrays.sort(people);
        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(people[i].age) + " " + people[i].name + "\n");
        }
        bw.flush();
        bw.close();
    }

}

class Person implements Comparable<Person> {

    String name;
    int age;
    int enroll;
    public Person(String name_, int age_, int enroll_) {
        this.name = name_;
        this.age = age_;
        this.enroll = enroll_;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return this.enroll - o.enroll;
        } else {
            return this.age - o.age;
        }
    }
}