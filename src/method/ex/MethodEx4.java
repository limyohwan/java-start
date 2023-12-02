package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1입금 | 2출금 | 3잔액확인 | 4종료");
            System.out.println("----------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액 입력 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액 입력 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("balance = " + balance);
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    return;
                default:
                    System.out.println("잘못된 옵션");
            }
        }
    }

    public static int deposit(int balance, int amount) { // 메서드를 적절하게 사용하면 읽기 좋고 구조적으로 좋은 코드를 작성할 수 있음
        balance += amount;
        System.out.println("balance = " + balance);
        System.out.println("amount = " + amount);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("balance = " + balance);
            System.out.println("amount = " + amount);
        } else {
            System.out.println("잔액 부족");
        }

        return balance;
    }
}
