public class N02_Variables_Method {

    // 변수 타입
    // 원시 자료형(Primitive Type) : 숫자형 데이터 타입
    // 클래스 타입(Class Type)     : 추후에 다룸
    // 랩퍼 클래스(Wrapper Class)  : 원시 자료형에 대한 클래스 타입

    // 변수 선언 방법
    // [접근제어자] 타입 변수명
    // 멤버 변수
    byte byte_variable; // 1바이트(-128 ~ 127)
    char char_variable; // 2바이트(0 ~ 65535)
    short short_variable; // 2바이트(-32768 ~ 32767)
    int int_variable; // 4바이트
    long long_variable; // 8바이트
    float float_variable; //4바이트 실수
    double double_variable; // 8바이트 실수
    boolean boolean_variable; // 1바이트(true or false)

    String name;

    // 클래스 변수
    static int instance_num = 0;

    // 생성자 메소드
    // 매개 변수
    public N02_Variables_Method(String _name) {
        N02_Variables_Method.instance_num++;
        this.name = _name;
    }

    // 메소드 선언 방법
    // [접근제어자] 리턴타입 메소드명([인자..]) {}
    // 메소드(name 출력)
    public void printName() {
        System.out.println(this.name);
    }
    // 가변 인자(Variable Arguments) : 메소드는 인자의 수를 유동적으로 받을 수 있음
    // String... msg 등 과 같이 사용

    public static void main(String args[]) {
        System.out.println("=============== Main Start ===============");
        System.out.println("N02");

        N02_Variables_Method n02_variables_method = new N02_Variables_Method("Steven");
        n02_variables_method.printName();

        System.out.println("===============  Main End  ===============");
    }
}
