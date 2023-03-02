public class N01_Architecture {

    // 변수 선언(맴버 변수)
    int num1;
    String name;

    // 생성자
    public N01_Architecture(int _num1, String _name) {
        this.name = _name;
        this.num1 = _num1;
    }

    // 매서드(num 값 수정)
    public void setNum(int _num1) {
        num1 = _num1;
    }

    // 매서드(name 값 수정)
    public void setName(String _name) {
        name = _name;
    }

    // 매서드(name 출력)
    public void printName() {
        System.out.println(name);
    }

    // 매서드(num 출력)
    public void printNum() {
        System.out.println(num1);
    }

    // main
    public static void main(String args[]) {
        System.out.println("========== Main Start ==========");
        System.out.println("N01");
        N01_Architecture n01_architecture = new N01_Architecture(10, "Steven");

        n01_architecture.printName();
        n01_architecture.printNum();
        System.out.println("==========  Main End  ==========");
    }
}
