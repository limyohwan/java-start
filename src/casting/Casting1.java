package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 자동 형변환, 묵시적 형변환 = 작은 값을 큰 값에 넣는 경우
        longValue = (long) intValue; // (long) 생략 가능
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = (double) 200000000000000000L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
