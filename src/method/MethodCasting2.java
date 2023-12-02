package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 자동 형변환
    }
    
    public static void printNumber(double n) {
        System.out.println("n = " + n);
    }
}
