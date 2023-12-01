package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) { // i는 반복문에서 사용하는 변수인데 while문은 강제적으로 밖에서 선언하게 됨
            sum += i++;
            System.out.println("sum = " + sum);
        }
    }
}
