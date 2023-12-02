package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1 number = " + number);
        changeNumber(number);
        System.out.println("4 number = " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2 number = " + number);
        number = number * 2;
        System.out.println("3 number = " + number);
    }
}
