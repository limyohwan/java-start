package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) { // Break2와 비교해 깔끔해짐
            sum += i;
            if (sum > 10) {
                System.out.println("sum = " + sum);
                break; // 해당 반복문을 완전히 종료시킴
            }
        }

        // for 문안에서 선언한 i는 for 문안에서만 사용 가능
    }
}
