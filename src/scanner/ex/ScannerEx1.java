package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("나이 : ");
        int age = scanner.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
