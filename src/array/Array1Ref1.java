package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students = new int[5]; // 5개의 공간에 0으로 자동 초기화(primitve type의 기본값)
        System.out.println(students); // [I는 int형 배열을 의미함

        // 변수 값 대입
        students[0] = 90; // 배열은 0부터 시작
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);
    }
}
