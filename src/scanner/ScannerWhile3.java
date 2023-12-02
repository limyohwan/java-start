package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while(true) {
            System.out.print("숫자 입력(0은 종료) : ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("모든 정수 합 : " + sum);
    }
}
