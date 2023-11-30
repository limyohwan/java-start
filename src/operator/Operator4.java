package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // 식이 복잡한 경우 괄호를 명시적으로 사용하는게 가독성이 좋음
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}