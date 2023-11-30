package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        // 불필요한 조건들을 계속 검색하게 되어 코드의 효율성이 좋지 않음
        // 서로 독립 조건일 때 사용
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if (age >= 20){
            System.out.println("성인");
        }
    }
}
