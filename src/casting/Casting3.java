package casting;

public class Casting3 {
    public static void main(String[] args) {
        int maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue = " + intValue);

        intValue = (int) maxIntOver; // 형변환, int 범위를 넘는 숫자면 int의 제일 작은 범위부터 다시 시작함, 오버플로우 발생
        System.out.println("maxIntOver = " + intValue);
    }
}
