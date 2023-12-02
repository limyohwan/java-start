package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // 컴파일 에러
        printNumber((int) number); // 명시적 형변환
    }
    
    public static void printNumber(int n) {
        System.out.println("n = " + n);
    }
}
