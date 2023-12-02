package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문은 for-each문이라고도 함, 인덱스 값을 사용해야하는 경우에는 일반 for문을 사용하는게 나음(억지로 int i 선언X)
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
