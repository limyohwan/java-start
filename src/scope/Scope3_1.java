package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // temp는 if문 안에서만 사용하는데 메인에서 사용하게 되면 불필요한 메모리가 낭비될 수 있으며 스코프가 불필요하게 넓어 코드 복잡성이 증가함
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        System.out.println("temp = " + temp); // 필요없는 temp를 사용할 수 있으며 이는 개발자들에게 고민할 여지를 주게 됨
        // 좋은 프로그램은 무한한 자유가 아닌 적절한 제약이 있는 프로그램임
    }
}
