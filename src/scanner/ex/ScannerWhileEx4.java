package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3 : 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명 입력 : ");
                String product = scanner.nextLine();

                System.out.print("상품 가격 입력 : ");
                int price = scanner.nextInt();

                System.out.print("상품 수량 입력 : ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;

                System.out.println("product = " + product);
                System.out.println("price = " + price);
                System.out.println("quantity = " + quantity);
            } else if (option == 2) {
                System.out.println("totalPrice = " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("종료");
                break;
            } else  {
                System.out.println("명확하지 않은 옵션");
            }
        }


    }
}
