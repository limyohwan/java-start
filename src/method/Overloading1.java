package method;

public class Overloading1 {
    // 메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서), 반환타입은 포함안됨
    // 오버로딩 실패 케이스
    // int add(int a, int b)
    // double add(int a, int b) 반환 타입은 포함안됨
    // int add(int x, int y) 매개변수 타입으로 구분함
    public static void main(String[] args) {
        System.out.println("1 : " + add(1, 2));
        System.out.println("2 : " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("2개 더하기");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("3개 더하기");
        return a + b + c;
    }
}
