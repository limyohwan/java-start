package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 10;

        sum+=i++;
        System.out.println("sum = " + sum);
        sum+=i++;
        System.out.println("sum = " + sum);
        sum+=i++;
        System.out.println("sum = " + sum);
    }
}
