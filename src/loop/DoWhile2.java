package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do { // do while문은 최초 한번은 실행됨
            System.out.println("i = " + i);
            i++;
        }  while (i < 3); // 이게 참이면 위로 돌아가서 반복
    }
}
