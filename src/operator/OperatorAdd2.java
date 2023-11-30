package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b;

        b = ++a; // a의 값을 먼저 증가시키고 그 값을 b에 대입
        // a = a + 1;
        // b = a
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 후위 증감 연산자
        int c = 1;
        int d;

        d = c++; // c의 현재 값을 d에 먼저 대입하고 그 후 c의 값을 증가시킴
        // d = c;
        // c = c + 1;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
