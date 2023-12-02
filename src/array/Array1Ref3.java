package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = new int[]{90,80, 70, 60, 50}; // 배열 선언, 생성, 초기화
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("student" + (i + 1) + " = " + students[i]);
        }
    }
}
