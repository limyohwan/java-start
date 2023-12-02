package method;

// (매우중요) 자바는 항상 변수의 값을 복사해서 대입함
public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("num1 = " + num1);
        changeNumber(num1);
        System.out.println("num1 = " + num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("num2 = " + num2);
        num2 = num2 * 2;
        System.out.println("num2 = " + num2);
    }
}
