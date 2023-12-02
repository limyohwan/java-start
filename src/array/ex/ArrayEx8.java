package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수 입력");
        int studentCount = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[studentCount][subjects.length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적 입력");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = (double) total / subjects.length;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + " 평균 : " + average);
        }
    }
}
