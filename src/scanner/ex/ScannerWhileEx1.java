package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름 입력(종료 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("종료");
                break;
            }

            System.out.print("나이 : ");
            int age = scanner.nextInt(); // 스캐너에서 10을 입력하면 실제로는 10\n이 출력하게 되는데 nextInt는 10\n에서 10만 가지고 가기 때문에 \n이 남게됨
            scanner.nextLine(); // 그렇기 때문에 여기서 \n을 처리해주어야지만 코드가 정상적으로 동작함

            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }
    }
}
