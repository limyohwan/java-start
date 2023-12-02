package method;

public class Method1 {

    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b= 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("sum1 = " + sum1);

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("sum2 = " + sum2);

        // 함수는 블랙 박스와 같다, 함수는 한번 정의해두면 재사용 가능하다
    }
}
