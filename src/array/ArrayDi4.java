package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2차원 배열
        int[][] arr = new int[4][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        
    }
}
