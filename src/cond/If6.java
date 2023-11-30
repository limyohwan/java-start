package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("만원이상 구매 천원할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount);

        if (true)
            System.out.println("if문에서 실행"); // 한줄까지만 중괄호 생략 가능
        // 중괄호를 사용하는게 가독성과 유지보수성에 좋음
    }
}
