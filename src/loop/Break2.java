package loop;

public class Break2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(;;) {
            sum += i++;
            if (sum > 10) {
                System.out.println("sum = " + sum);
                break; // 해당 반복문을 완전히 종료시킴
            }
        }
    }
}
