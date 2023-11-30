package cond;

public class If4 {

    public static void main(String[] args) {
        int age = 7;

        // 순서대로 if 문을 실행해 해당 조건에 참일 경우 조건문을 빠져나옴, 불필요한 추가 체크를 하지 않음
        // 서로 연관된 조건이여서 하나로 묶을 떄 사용
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13){
            System.out.println("초등학생");
        } else if (age <= 16){
            System.out.println("중학생");
        } else if (age <= 19){
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
