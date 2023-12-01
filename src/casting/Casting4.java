package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int = int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // int / int = int -> 이 int(1)을 double(1.0)로 형변환이 일어남
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // double / int = double
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // double / int = double
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int  b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
