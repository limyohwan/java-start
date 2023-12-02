package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("average = " + average(1, 2, 3));
        System.out.println("average = " + average(15, 25, 35));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
