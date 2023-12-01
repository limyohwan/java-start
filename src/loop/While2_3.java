package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int startNum = 1;
        int endNum = 10;

        while (startNum <= endNum) {
            sum+=startNum++;
            System.out.println("sum = " + sum);
        }
    }
}
