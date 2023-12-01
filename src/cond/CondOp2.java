package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        // 삼항 연산자를 사용해서 코드를 간결하게 표현할 수 있음
        String status = age >= 18 ? "성인" : "미성년자";

        System.out.println("age = " + age);
        System.out.println("status = " + status);
    }
}
