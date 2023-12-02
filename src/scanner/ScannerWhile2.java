package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자, 두번째 숫자 모두 0을 입력할 시 종료 ");
        while(true) {
            System.out.print("첫번째 숫자 입력 : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자 입력 : ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }

            int sum = num1 + num2;
            System.out.println("sum = " + sum);
        }

        System.out.println("종료");
    }
}
