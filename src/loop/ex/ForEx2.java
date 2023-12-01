package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        for (int num = 2, count = 1; count <= 10; num += 2, count++) { // 여러 변수를 선언할 수 있지만 하나의 증감식만 사용하는게 더 깔끔한 코드임
            System.out.println("num = " + num);
        }
    }
}
