package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5]; // 5개의 공간에 0으로 자동 초기화(primitve type의 기본값)

        // 변수 값 대입
        students[0] = 90; // 배열은 0부터 시작
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("student" + (i + 1) + " = " + students[i]);
        }
    }
}
