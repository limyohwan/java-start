package operator;

public class Operator1 {
    // 3 + 4, a + b
    // 연산자 = 연산 기호(+, - ...)
    // 피연산자 = 연산 대상(3, 4, a, b)
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int multi = a * b;
        System.out.println(multi);

        int div = a / b; // 자바에서는 0으로는 나눌 수 없음
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);
    }
}
