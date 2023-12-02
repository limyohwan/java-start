package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        // 1000원 입금
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println("balance = " + balance);
        System.out.println("depositAmount = " + depositAmount);

        // 2000원 출금
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("balance = " + balance);
            System.out.println("withdrawAmount = " + withdrawAmount);
        } else {
            System.out.println("잔액 부족");
        }

        System.out.println("balance = " + balance);
    }
}
