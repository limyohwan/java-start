package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90,80, 70, 60, 50};

        int total = 0;
        for (int student : students) {
            total += student;
        }

        double average = (double) total / students.length;
        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
