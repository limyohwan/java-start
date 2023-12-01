package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
//                coupon = 2000; // break 문이 없으면 다음 코드를 수행함
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        };

        System.out.println("coupon = " + coupon);
    }
}
