package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격 입력(-1 입력하면 종료) : ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("종료");
                break;
            }

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();

            int totalPrice = price * quantity;
            System.out.println("totalPrice = " + totalPrice);
        }
    }
}
