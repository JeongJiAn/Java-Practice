import java.util.Scanner;

public class N11718 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        while (scan.hasNext()) {
            result = result + scan.nextLine() + "\n";
        }
        System.out.println(result);
    }
}
