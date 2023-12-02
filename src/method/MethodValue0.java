package method;

// (매우중요) 자바는 항상 변수의 값을 복사해서 대입함
public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // 값을 복사해서 대입함
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
