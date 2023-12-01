package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 바로 반복문의 조건식으로 돌아감
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
