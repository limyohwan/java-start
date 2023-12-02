package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args) {
        int balance = 10000;

        // 1000원 입금
        balance = deposit(balance, 1000);

        // 2000원 출금
        balance = withdraw(balance, 2000);

        System.out.println("balance = " + balance);
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
