package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // i는 for문 안에서 선언했기 때문에 for문이 종료되면 접근 불가능함
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // i 생존 종료
        System.out.println("main m = " + m);
//        System.out.println("main i = " + i); // i는 컴파일 에러
    }
}
