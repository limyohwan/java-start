package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 : ");
        String name = scanner.nextLine();

        System.out.print("음식 가격 : ");
        int price = scanner.nextInt();

        System.out.print("음식 수량 : ");
        int quantity = scanner.nextInt();

        int totalPrice = price * quantity;
        System.out.println("totalPrice = " + totalPrice);
    }
}
