package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(1, 2); // 1, 2 같은 값을 인자(argument) 또는 인수라고 함, 인수 = 메서드 내부로 들어가는 값
        System.out.println("sum1 = " + sum1);

        // 계산2
        int sum2 = add(10, 20);
        System.out.println("sum2 = " + sum2);
    }

    // int를 반환타입, a와 b를 파라미터(매개변수)라고 함, 매개변수 = 중간에 전달하는 변수
    // 제어자 반환타입 메서드이름(매개변수 목록) { 메서드 본문 }
    public static int add(int a, int b) { // 블록안이 메서드 본문이며 메서드 본문은 블랙박스임
        System.out.println(a + " + " + b + " 연산 수행");
        return a + b;
    }
}
