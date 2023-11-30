package operator;

public class Comp1 {
    // 비교 연산자
    // == 동등성
    // != 불일치 등등
    // true 와 false 값만 나옴
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println(result);
    }
}
