package loop;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
        }

        // while문보다 for문이 더 깔끔함
        // for문은 카운터 변수를 다른 부분과 명확하게 구분할 수 있음, 로직만 안에서 실행 가능
        // while문은 반복문 안에 카운터 변수가 같이 들어가 있게됨

        for(;;) { // for문에서 초기식 조건식 증감식은 다 생략 가능함 단 세미콜론(;)은 유지해야됨
            // 무한루프 코드
        }
    }
}
