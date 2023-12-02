package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {// 리턴이 안되는 케이스가 있으면 컴파일 에러 발생
            return true;
        } else {
            return false;
        }
    }

    public static boolean odd2(int i) {
        if (i % 2 == 1) {
            return true;
        }

        return false;
    }

    public static boolean odd3(int i) {
        return i % 2 == 1;
    }
}
