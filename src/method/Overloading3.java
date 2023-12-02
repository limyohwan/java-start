package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println(add(1, 2)); // 정확한 타입을 먼저 호출하고 그게 없으면 자동 형변환할 수 있는 메서드를 찾음
        System.out.println(add(1.2, 1.2));
    }

//    public static int add(int a, int b) {
//        System.out.println("int a, int b");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("double a, double b");
        return a + b;
    }
}
