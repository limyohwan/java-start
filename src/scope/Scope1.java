package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
//        System.out.println("main x = " + x); // x는 컴파일 에러
        System.out.println("main m = " + m);
    } // m 생존 종료
    // 변수가 접근할 수 있는 범위를 스코프(scope)라고 함
    // 지역 변수는 본인의 코드 블록안에서만 생존
}
